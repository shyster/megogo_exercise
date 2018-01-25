package com.example.xml;

import java.util.List;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */

public class Tv
{
    private  List<Programme> programme;

    private String source_info_url;

    private String generator_info_url;

    private Channel channel;

    private String source_info_name;

    public List<Programme> getProgramme ()
    {
        return programme;
    }

    public void setProgramme (List<Programme> programme)
    {
        this.programme = programme;
    }

    public String getSource_info_url ()
{
    return source_info_url;
}

    public void setSource_info_url (String source_info_url)
{
    this.source_info_url = source_info_url;
}

    public String getGenerator_info_url ()
{
    return generator_info_url;
}

    public void setGenerator_info_url (String generator_info_url)
{
    this.generator_info_url = generator_info_url;
}

    public Channel getChannel ()
    {
        return channel;
    }

    public void setChannel (Channel channel)
    {
        this.channel = channel;
    }

    public String getSource_info_name ()
{
    return source_info_name;
}

    public void setSource_info_name (String source_info_name)
{
    this.source_info_name = source_info_name;
}

    @Override
    public String toString()
    {
        return "ClassPojo [programme = "+programme+", source_info_url = "+source_info_url+", generator_info_url = "+generator_info_url+", channel = "+channel+", source_info_name = "+source_info_name+"]";
    }
}