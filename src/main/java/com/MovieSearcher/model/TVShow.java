package com.MovieSearcher.model;

public class TVShow extends AudioVisual{
    private int numberOfSeasons;
    private int numberOfEPS;
    private String firstEPReleaseDate;
    private String lastEPReleaseDate;

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEPS() {
        return numberOfEPS;
    }

    public void setNumberOfEPS(int numberOfEPS) {
        this.numberOfEPS = numberOfEPS;
    }

    public String getFirstEPReleaseDate() {
        return firstEPReleaseDate;
    }

    public void setFirstEPReleaseDate(String firstEPReleaseDate) {
        this.firstEPReleaseDate = firstEPReleaseDate;
    }

    public String getLastEPReleaseDate() {
        return lastEPReleaseDate;
    }

    public void setLastEPReleaseDate(String lastEPReleaseDate) {
        this.lastEPReleaseDate = lastEPReleaseDate;
    }
}
