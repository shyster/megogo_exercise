package com.example.xml;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */

public class Channel
{
    private String id;

    private String display_name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDisplay_name ()
{
    return display_name;
}

    public void setDisplay_name (String display_name)
{
    this.display_name = display_name;
}

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", display_name = "+display_name+"]";
    }
}
