package com.megogo.exercise.utils;

import com.megogo.exercise.channel_objects.xml.Tv;
import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.megogo.exercise.utils.Constants.XML_DATE_FORMAT;

/**
 * Created by Vladislav Kulasov on 28.01.2018.
 */
public class XmlHelper {
    private Logger logger = Logger.getLogger(this.getClass());

    public List<ProgramScheduler> getProgramScheduler(Tv tv) {
        List<ProgramScheduler> programSchedullersXml = new ArrayList<>();
        tv.getProgramme().forEach(programme -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(XML_DATE_FORMAT);
            LocalDateTime startLocal = LocalDateTime.parse(programme.getStart(), formatter);
            LocalDateTime stopLocal = LocalDateTime.parse(programme.getStop(), formatter);
            ZoneOffset zoneOffsetStart = ZonedDateTime.parse(programme.getStart(), formatter).getOffset();
            ZoneOffset zoneOffsetStop = ZonedDateTime.parse(programme.getStart(), formatter).getOffset();
            programSchedullersXml.add(new ProgramScheduler(
                    programme.getTitle().getContent(),
                    Date.from(startLocal.atZone(zoneOffsetStart).toInstant()),
                    Date.from(stopLocal.atZone(zoneOffsetStop).toInstant())
            ));
        });

        logger.info("Got xml programs " + programSchedullersXml.size());
        return programSchedullersXml;
    }
}
