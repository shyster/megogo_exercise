package com.megogo.exercise.channel_objects.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
public class Genre
{
    private String content;

    private String lang;

    @XmlValue
    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    @XmlAttribute(name = "lang")
    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "content='" + content + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }
}
