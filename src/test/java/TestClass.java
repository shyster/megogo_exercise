import com.example.json.Datum;
import com.example.json.Program;
import com.example.xml.Programme;
import com.example.xml.Tv;
import com.jayway.restassured.path.xml.XmlPath;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
public class TestClass {
    private static final String XML_URL = "http://www.vsetv.com/export/megogo/epg/3.xml";
    private static final String JSON_URL = "http://epg.megogo.net/channel?external_id=295";
    private static final int SC_OK = 200; //good response

    @Test(description = "compare xml and json for One plus One Channel")
    public void compareXmlandJsonProgram(){
//        Datum datum = given().get(JSON_URL).then().statusCode(SC_OK).extract().jsonPath().getObject("data[0]", Datum.class);
        Tv tv = given().get(XML_URL).then().statusCode(SC_OK).extract().xmlPath().getObject("tv", Tv.class);

        for (Programme programme : tv.getProgramme()){
            System.out.println(programme.toString());
        }

//        for (Program program : datum.getPrograms()){
//            System.out.println(program.toString());
//        }

    }
}
