package com.example.json;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "external_id",
        "title",
        "programs",
        "pictures",
        "video_id"
})
public class Datum {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("external_id")
    private Integer externalId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("programs")
    private List<Program> programs = null;
    @JsonProperty("pictures")
    private Pictures_ pictures;
    @JsonProperty("video_id")
    private Object videoId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("external_id")
    public Integer getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("programs")
    public List<Program> getPrograms() {
        return programs;
    }

    @JsonProperty("programs")
    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

    @JsonProperty("pictures")
    public Pictures_ getPictures() {
        return pictures;
    }

    @JsonProperty("pictures")
    public void setPictures(Pictures_ pictures) {
        this.pictures = pictures;
    }

    @JsonProperty("video_id")
    public Object getVideoId() {
        return videoId;
    }

    @JsonProperty("video_id")
    public void setVideoId(Object videoId) {
        this.videoId = videoId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
