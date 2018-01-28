package com.megogo.exercise.utils;

import com.megogo.exercise.channel_objects.json.Channels;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.megogo.exercise.utils.Constants.JSON_URL_TEMPLATE;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.is;

/**
 * Created by Vladislav Kulasov on 28.01.2018.
 */
public class JsonHelper {
    private Logger logger = Logger.getLogger(this.getClass());

    public String getUrl(int channelId) {
        String url = String.format(JSON_URL_TEMPLATE, channelId);
        logger.info(url);
        return url;
    }

    public Channels getJsonProgram(int channelId) {
        return given()
                .get(getUrl(channelId))
                .then()
                .statusCode(SC_OK)
                .body("result", is("ok"))
                .extract()
                .jsonPath()
                .getObject(".", Channels.class);
    }

    public List<ProgramScheduler> getProgramSchedulers(Channels channels, int channelId) {
        List<ProgramScheduler> programSchedulersJson = new ArrayList<>();

        channels.getData()
                .stream()
                .filter(c -> c.getId().equals(channelId))
                .collect(Collectors.toList())
                .get(0).getPrograms()
                .forEach(program -> {
                    programSchedulersJson.add(new ProgramScheduler(
                            program.getTitle(),
                            new Date((long) program.getStartTimestamp() * 1000),
                            new Date((long) program.getEndTimestamp() * 1000)
                    ));
                });

        logger.info("Got json programs " + programSchedulersJson.size());
        return programSchedulersJson;
    }
}
