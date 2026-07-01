package com.MovieSearcher.model;

public abstract class MediaItem {
    protected int id;
    protected String name;
    protected double popularity;
    protected String picturePath;

    public MediaItem(int id, String name, double popularity, String picturePath) {
        this.id = id;
        this.name = name;
        this.popularity = popularity;
        this.picturePath = picturePath;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
