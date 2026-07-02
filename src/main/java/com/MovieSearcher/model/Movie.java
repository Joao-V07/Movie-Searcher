package com.MovieSearcher.model;

public class Movie extends AudioVisual{
    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                ", releaseDate='" + releaseDate + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", userLanguageTitle='" + userLanguageTitle + '\'' +
                ", voteAverage=" + voteAverage +
                ", genres=" + genres +
                ", budget=" + budget +
                ", revenue=" + revenue +
                ", tagline='" + tagline + '\'' +
                ", status='" + status + '\'' +
                ", production=" + production +
                ", creators=" + creators +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", picturePath='" + picturePath + '\'' +
                '}';
    }
}
