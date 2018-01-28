package com.megogo.exercise.tests;

import com.megogo.exercise.channel_objects.json.Channels;
import com.megogo.exercise.utils.JsonHelper;
import com.megogo.exercise.utils.ProgramScheduler;
import com.megogo.exercise.utils.XmlHelper;
import com.megogo.exercise.channel_objects.xml.Tv;
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
    private JsonHelper jsonHelper = new JsonHelper();
    private XmlHelper xmlHelper = new XmlHelper();

    private List<ProgramScheduler> programSchedulersJson, programSchedulersXml;

    @BeforeClass
    public void getPrograms(){
        Channels channels = jsonHelper.getJsonProgram(JSON_CHANNEL_ID);
        programSchedulersJson = jsonHelper.getProgramSchedulers(channels, JSON_CHANNEL_ID);

        Tv tv = xmlHelper.getXmlProgram(XML_CHANNEL_ID);
        programSchedulersXml = xmlHelper.getProgramSchedulers(tv);
    }

    @Test(description = "json contains in xml")
    public void testJsonContainsInXmlPrograms(){
        for (ProgramScheduler programScheduler : programSchedulersJson){
            logger.info("Validate :" + programScheduler.toString());
            Assert.assertTrue(programSchedulersXml.contains(programScheduler), "Not found in xml " + programScheduler.toString());
        }
    }

    @Test(description = "compare xml and json programs")
    public void testCompareJsonAndXmlPrograms(){
         Assert.assertEquals(programSchedulersXml, programSchedulersJson, "json and xml are not equal");
    }

    @Test(description = "Validate Json Schema")
    public void testValidateJsonSchema(){
        given().get(jsonHelper.getUrl(JSON_CHANNEL_ID))
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("program-schema.json"));
    }
}
