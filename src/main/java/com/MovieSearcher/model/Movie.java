package com.MovieSearcher.model;

public class Movie extends AudioVisual{
    private int runtime;

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "runtime=" + runtime +
                ", releaseDate='" + releaseDate + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", title='" + title + '\'' +
                ", voteAverage=" + voteAverage +
                ", genres=" + genres +
                ", budget=" + budget +
                ", revenue=" + revenue +
                ", tagline='" + tagline + '\'' +
                ", status='" + status + '\'' +
                ", production=" + production +
                ", credits=" + credits +
                ", originalTitle='" + originalTitle + '\'' +
                ", id=" + id +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
