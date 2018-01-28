package com.megogo.exercise.channel_objects.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
public class Programme {
    private Long id;

    private Desc desc;

    private Genre genre;

    private String stop;

    private Title title;

    private Category category;

    private String start;

    private String categoryId;

    private String date;

    private String channel;

    private Integer genreId;

    private String episodeNum;
    private String productionYear;
    private String megogoId;
    private String kinopoiskId;
    private String parental;

    @XmlElement(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "desc")
    public Desc getDesc() {
        return desc;
    }

    public void setDesc(Desc desc) {
        this.desc = desc;
    }

    @XmlElement(name = "genre")
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @XmlAttribute(name = "stop")
    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    @XmlElement(name = "title")
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @XmlElement(name = "category")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @XmlAttribute(name = "start")
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @XmlAttribute(name = "category_id")
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @XmlElement(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlAttribute(name = "channel")
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @XmlAttribute(name = "genre_id")
    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    @XmlElement(name = "episode-num")
    public String getEpisodeNum() {
        return episodeNum;
    }

    public void setEpisodeNum(String episodeNum) {
        this.episodeNum = episodeNum;
    }

    @XmlElement(name = "production_year")
    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    @XmlElement(name = "megogo_id")
    public String getMegogoId() {
        return megogoId;
    }

    public void setMegogoId(String megogoId) {
        this.megogoId = megogoId;
    }

    @XmlElement(name = "kinopoisk_id")
    public String getKinopoiskId() {
        return kinopoiskId;
    }

    public void setKinopoiskId(String kinopoiskId) {
        this.kinopoiskId = kinopoiskId;
    }

    @XmlElement(name = "parental")
    public String getParental() {
        return parental;
    }

    public void setParental(String parental) {
        this.parental = parental;
    }

    @Override
    public String toString() {
        return "Programme{" +
                "id=" + id +
                ", desc=" + desc +
                ", genre=" + genre +
                ", stop='" + stop + '\'' +
                ", title=" + title +
                ", category=" + category +
                ", start='" + start + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", date='" + date + '\'' +
                ", channel='" + channel + '\'' +
                ", genreId=" + genreId +
                ", episodeNum='" + episodeNum + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", megogoId='" + megogoId + '\'' +
                ", kinopoiskId='" + kinopoiskId + '\'' +
                ", parental='" + parental + '\'' +
                '}';
    }
}
