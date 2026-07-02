package com.MovieSearcher.model;

import java.util.List;

public abstract class AudioVisual extends MediaItem{
    protected String releaseDate;
    protected String originalLanguage;
    protected String userLanguageTitle;
    protected double voteAverage;
    protected List<String> genres;
    protected long budget;
    protected long revenue;
    protected String tagline;
    protected String status;
    protected List<String> production;
    protected List<String> creators;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getUserLanguageTitle() {
        return userLanguageTitle;
    }

    public void setUserLanguageTitle(String userLanguageTitle) {
        this.userLanguageTitle = userLanguageTitle;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getProduction() {
        return production;
    }

    public void setProduction(List<String> production) {
        this.production = production;
    }

    public List<String> getCreators() {
        return creators;
    }

    public void setCreators(List<String> creators) {
        this.creators = creators;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }
}
