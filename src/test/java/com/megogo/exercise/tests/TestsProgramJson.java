package com.megogo.exercise.tests;

import com.megogo.exercise.channel_objects.json.Channels;
import com.megogo.exercise.channel_objects.xml.Tv;
import com.megogo.exercise.utils.*;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
public class TestsProgramJson {
    private int jsonChannelId;
    private Logger logger = Logger.getLogger(this.getClass());

    private RestClient jsonRestClient = new JsonRestClient();
    private List<ProgramScheduler> programSchedulerJson, programSchedulerXml;

    @Parameters({"3", "295"})
    @BeforeClass
    public void getPrograms(@Optional("3") int xmlChannelId, @Optional("295") int jsonChannelId) {
        this.jsonChannelId = jsonChannelId;

        JsonHelper jsonHelper = new JsonHelper();
        Channels channels = (Channels) jsonRestClient.getProgram(jsonChannelId);
        programSchedulerJson = jsonHelper.getProgramScheduler(channels, jsonChannelId);

        RestClient xmlRestClient = new XmlRestClient();
        XmlHelper xmlHelper = new XmlHelper();
        Tv tv = (Tv) xmlRestClient.getProgram(xmlChannelId);
        programSchedulerXml = xmlHelper.getProgramScheduler(tv);
    }

    @Test(description = "json contains in xml")
    public void testJsonContainsInXmlPrograms() {
        for (ProgramScheduler programScheduler : programSchedulerJson) {
            logger.info("Validate :" + programScheduler.toString());
            Assert.assertTrue(programSchedulerXml.contains(programScheduler), "Not found in xml " + programScheduler.toString());
        }
        // Assert.assertTrue(programSchedulerXml.containsAll(programSchedulerJson), "Not found in xml ");
    }

    @Test(description = "compare xml and json programs")
    public void testCompareJsonAndXmlPrograms() {
        Assert.assertEquals(programSchedulerXml, programSchedulerJson, "json and xml are not equal");
    }

    @Test(description = "Validate Json Schema")
    public void testValidateJsonSchema() {
        given().get(jsonRestClient.getUrl(jsonChannelId))
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("program-schema.json"));
    }
}
