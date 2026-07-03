package com.MovieSearcher.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public abstract class AudioVisual extends MediaItem{
    protected String releaseDate;
    protected String originalLanguage;
    protected String title;
    protected double voteAverage;
    protected List<Genre> genres;
    protected long budget;
    protected long revenue;
    protected String tagline;
    protected String status;
    @SerializedName("production_companies")
    protected List<ProductionCompanies> production;
    @SerializedName("poster_path")
    protected String posterPath;


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
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

    public List<ProductionCompanies> getProduction() {
        return production;
    }

    public void setProduction(List<ProductionCompanies> production) {
        this.production = production;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }
}
