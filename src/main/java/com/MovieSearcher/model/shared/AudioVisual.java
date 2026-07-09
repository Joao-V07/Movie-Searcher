package com.MovieSearcher.model.shared;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public abstract class AudioVisual extends MediaItem{
    protected String originalLanguage;
    protected double voteAverage;
    protected List<Genre> genres;
    protected String tagline;
    protected String status;
    @SerializedName("production_companies")
    protected List<ProductionCompanies> production;
    @SerializedName("poster_path")
    protected String posterPath;
    protected Credits credits;
    protected String overview;


    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
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

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Credits getCredits() {
        return credits;
    }

    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
