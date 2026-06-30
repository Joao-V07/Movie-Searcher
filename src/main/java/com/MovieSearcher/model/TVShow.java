package com.MovieSearcher.model;

public class TVShow extends AudioVisual{
    private int numberOfSeasons;

    public TVShow(String name) {
        super(name);
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
}
