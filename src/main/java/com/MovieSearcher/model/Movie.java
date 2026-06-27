package com.MovieSearcher.model;

public class Movie extends AudioVisual{
    private int duration;

    public Movie(String name) {
        super(name);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
