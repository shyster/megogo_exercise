package com.example.xml;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */

public class XmlContainer
{
    private Tv tv;

    public Tv getTv ()
    {
        return tv;
    }

    public void setTv (Tv tv)
    {
        this.tv = tv;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tv = "+tv+"]";
    }
}
