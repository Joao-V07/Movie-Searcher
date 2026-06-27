package com.MovieSearcher.model;

public class Show extends AudioVisual{
    private int numberOfSeasons;

    public Show(String name) {
        super(name);
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
}
