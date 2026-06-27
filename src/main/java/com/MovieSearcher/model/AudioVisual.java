package com.MovieSearcher.model;

public abstract class AudioVisual extends MediaItem{
    protected String description;
    protected String releaseDate;

    public AudioVisual(String name) {
        super(name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
