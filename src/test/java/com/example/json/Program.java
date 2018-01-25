package com.example.json;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Vladislav Kulasov on 25.01.2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "external_id",
        "object_id",
        "year",
        "title",
        "description",
        "schedule_string",
        "genre",
        "category",
        "pictures",
        "virtual_object_id",
        "start",
        "start_timestamp",
        "end",
        "end_timestamp",
        "grouped_programs",
        "schedule_type"
})
public class Program {

    @JsonProperty("external_id")
    private Integer externalId;
    @JsonProperty("object_id")
    private Object objectId;
    @JsonProperty("year")
    private String year;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("schedule_string")
    private Object scheduleString;
    @JsonProperty("genre")
    private Genre genre;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("pictures")
    private Pictures pictures;
    @JsonProperty("virtual_object_id")
    private String virtualObjectId;
    @JsonProperty("start")
    private Date start;
    @JsonProperty("start_timestamp")
    private Integer startTimestamp;
    @JsonProperty("end")
    private String end;
    @JsonProperty("end_timestamp")
    private Integer endTimestamp;
    @JsonProperty("grouped_programs")
    private Object groupedPrograms;
    @JsonProperty("schedule_type")
    private String scheduleType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("external_id")
    public Integer getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("object_id")
    public Object getObjectId() {
        return objectId;
    }

    @JsonProperty("object_id")
    public void setObjectId(Object objectId) {
        this.objectId = objectId;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("schedule_string")
    public Object getScheduleString() {
        return scheduleString;
    }

    @JsonProperty("schedule_string")
    public void setScheduleString(Object scheduleString) {
        this.scheduleString = scheduleString;
    }

    @JsonProperty("genre")
    public Genre getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("pictures")
    public Pictures getPictures() {
        return pictures;
    }

    @JsonProperty("pictures")
    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }

    @JsonProperty("virtual_object_id")
    public String getVirtualObjectId() {
        return virtualObjectId;
    }

    @JsonProperty("virtual_object_id")
    public void setVirtualObjectId(String virtualObjectId) {
        this.virtualObjectId = virtualObjectId;
    }

    @JsonProperty("start")
    public Date getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Date start) {
        this.start = start;
    }

    @JsonProperty("start_timestamp")
    public Integer getStartTimestamp() {
        return startTimestamp;
    }

    @JsonProperty("start_timestamp")
    public void setStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    @JsonProperty("end_timestamp")
    public Integer getEndTimestamp() {
        return endTimestamp;
    }

    @JsonProperty("end_timestamp")
    public void setEndTimestamp(Integer endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    @JsonProperty("grouped_programs")
    public Object getGroupedPrograms() {
        return groupedPrograms;
    }

    @JsonProperty("grouped_programs")
    public void setGroupedPrograms(Object groupedPrograms) {
        this.groupedPrograms = groupedPrograms;
    }

    @JsonProperty("schedule_type")
    public String getScheduleType() {
        return scheduleType;
    }

    @JsonProperty("schedule_type")
    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
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
