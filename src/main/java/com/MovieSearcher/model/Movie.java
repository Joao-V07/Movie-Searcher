package com.MovieSearcher.model;

public class Movie extends AudioVisual{
    private int runtime;
    private long budget;
    private long revenue;
    private String releaseDate;
    private String title;
    private String originalTitle;

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "runtime=" + runtime +
                ", budget=" + budget +
                ", revenue=" + revenue +
                ", releaseDate='" + releaseDate + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", title='" + title + '\'' +
                ", voteAverage=" + voteAverage +
                ", genres=" + genres +
                ", tagline='" + tagline + '\'' +
                ", status='" + status + '\'' +
                ", production=" + production +
                ", posterPath='" + posterPath + '\'' +
                ", credits=" + credits +
                ", originalTitle='" + originalTitle + '\'' +
                ", overview='" + overview + '\'' +
                ", id=" + id +
                ", popularity=" + popularity +
                '}';
    }
}
