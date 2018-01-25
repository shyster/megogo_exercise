package com.example.xml;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
public class Programme
{
    private Long id;

    private Genre genre;

    private String stop;

    private Title title;

    private Category category;

    private String start;

    private String category_id;

    private String date;

    private String channel;

    private String genre_id;

    public Long getId ()
    {
        return id;
    }

    public void setId (Long id)
    {
        this.id = id;
    }

    public Genre getGenre ()
    {
        return genre;
    }

    public void setGenre (Genre genre)
    {
        this.genre = genre;
    }

    public String getStop ()
    {
        return stop;
    }

    public void setStop (String stop)
    {
        this.stop = stop;
    }

    public Title getTitle ()
    {
        return title;
    }

    public void setTitle (Title title)
    {
        this.title = title;
    }

    public Category getCategory ()
    {
        return category;
    }

    public void setCategory (Category category)
    {
        this.category = category;
    }

    public String getStart ()
    {
        return start;
    }

    public void setStart (String start)
    {
        this.start = start;
    }

    public String getCategory_id ()
    {
        return category_id;
    }

    public void setCategory_id (String category_id)
    {
        this.category_id = category_id;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getChannel ()
    {
        return channel;
    }

    public void setChannel (String channel)
    {
        this.channel = channel;
    }

    public String getGenre_id ()
    {
        return genre_id;
    }

    public void setGenre_id (String genre_id)
    {
        this.genre_id = genre_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", genre = "+genre+", stop = "+stop+", title = "+title+", category = "+category+", start = "+start+", category_id = "+category_id+", date = "+date+", channel = "+channel+", genre_id = "+genre_id+"]";
    }
}
