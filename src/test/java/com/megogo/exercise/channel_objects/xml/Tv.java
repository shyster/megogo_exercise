package com.megogo.exercise.channel_objects.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
@XmlRootElement
public class Tv
{
    private  List<Programme> programme;

    private String sourceInfoUrl;

    private String generatorInfoUrl;

    private Channel channel;

    private String sourceInfoName;

    @XmlElement(name="programme")
    public List<Programme> getProgramme ()
    {
        return programme;
    }

    public void setProgramme (List<Programme> programme)
    {
        this.programme = programme;
    }

    @XmlAttribute(name = "source-info-url")
    public String getSourceInfoUrl()
{
    return sourceInfoUrl;
}

    public void setSourceInfoUrl(String sourceInfoUrl)
{
    this.sourceInfoUrl = sourceInfoUrl;
}

    @XmlAttribute(name = "generator-info-url")
    public String getGeneratorInfoUrl()
{
    return generatorInfoUrl;
}

    public void setGeneratorInfoUrl(String generatorInfoUrl)
{
    this.generatorInfoUrl = generatorInfoUrl;
}

    @XmlElement(name="channel")
    public Channel getChannel ()
    {
        return channel;
    }

    public void setChannel (Channel channel)
    {
        this.channel = channel;
    }

    @XmlAttribute(name = "source-info-name")
    public String getSourceInfoName()
{
    return sourceInfoName;
}

    public void setSourceInfoName(String sourceInfoName)
{
    this.sourceInfoName = sourceInfoName;
}

    @Override
    public String toString() {
        return "Tv{" +
                "programme=" + programme +
                ", sourceInfoUrl='" + sourceInfoUrl + '\'' +
                ", generatorInfoUrl='" + generatorInfoUrl + '\'' +
                ", channel=" + channel +
                ", sourceInfoName='" + sourceInfoName + '\'' +
                '}';
    }
}