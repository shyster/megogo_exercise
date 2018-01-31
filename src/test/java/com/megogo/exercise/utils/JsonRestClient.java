package com.megogo.exercise.utils;

import com.megogo.exercise.channel_objects.json.Channels;
import org.apache.log4j.Logger;

import static com.megogo.exercise.utils.Constants.JSON_URL_TEMPLATE;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.is;

/**
 * Created by Vladislav Kulasov on 28.01.2018.
 */
public class JsonRestClient implements RestClient{
    private Logger logger = Logger.getLogger(this.getClass());

    public String getUrl(int channelId) {
        String url = String.format(JSON_URL_TEMPLATE, channelId);
        logger.info(url);
        return url;
    }

    public Object getProgram(int channelId) {
        return given()
                .get(getUrl(channelId))
                .then()
                .statusCode(SC_OK)
                .body("result", is("ok"))
                .extract()
                .jsonPath()
                .getObject(".", Channels.class);
    }
}
