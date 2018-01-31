package com.megogo.exercise.tests;

import com.megogo.exercise.channel_objects.json.Channels;
import com.megogo.exercise.channel_objects.xml.Tv;
import com.megogo.exercise.utils.*;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
public class TestsProgramJson {
    private static final int XML_CHANNEL_ID = 3;
    private static final int JSON_CHANNEL_ID = 295;
    private Logger logger = Logger.getLogger(this.getClass());

    private RestClient jsonRestClient = new JsonRestClient();
    private List<ProgramScheduler> programSchedulerJson, programSchedulerXml;

    @BeforeClass
    public void getPrograms() {
        JsonHelper jsonHelper = new JsonHelper();
        Channels channels = (Channels) jsonRestClient.getProgram(JSON_CHANNEL_ID);
        programSchedulerJson = jsonHelper.getProgramScheduler(channels, JSON_CHANNEL_ID);

        RestClient xmlRestClient = new XmlRestClient();
        XmlHelper xmlHelper = new XmlHelper();
        Tv tv = (Tv) xmlRestClient.getProgram(XML_CHANNEL_ID);
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
        given().get(jsonRestClient.getUrl(JSON_CHANNEL_ID))
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("program-schema.json"));
    }
}
