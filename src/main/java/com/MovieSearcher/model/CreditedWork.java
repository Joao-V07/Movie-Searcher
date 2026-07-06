package com.MovieSearcher.model;

import com.google.gson.annotations.SerializedName;

public class CreditedWork {
    private String title;
    private String name;
    private String character;
    @SerializedName("media_type")
    private String mediaType;
    private String job;
    private Double popularity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "CreditedWork{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", character='" + character + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", job='" + job + '\'' +
                ", popularity=" + popularity +
                '}';
    }


}
