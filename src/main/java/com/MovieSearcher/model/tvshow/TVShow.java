package com.MovieSearcher.model.tvshow;

import com.MovieSearcher.model.shared.AudioVisual;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShow extends AudioVisual {
    private int numberOfSeasons;
    private int numberOfEpisodes;
    @SerializedName("first_air_date")
    private String firstEPReleaseDate;
    @SerializedName("last_air_date")
    private String lastEPReleaseDate;
    @SerializedName("created_by")
    private List<Creators> creators;
    private String name;
    private String originalName;

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
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

    public List<Creators> getCreators() {
        return creators;
    }

    public void setCreators(List<Creators> creators) {
        this.creators = creators;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "numberOfSeasons=" + numberOfSeasons +
                ", numberOfEpisodes=" + numberOfEpisodes +
                ", firstEPReleaseDate='" + firstEPReleaseDate + '\'' +
                ", lastEPReleaseDate='" + lastEPReleaseDate + '\'' +
                ", creators=" + creators +
                ", name='" + name + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", voteAverage=" + voteAverage +
                ", genres=" + genres +
                ", tagline='" + tagline + '\'' +
                ", status='" + status + '\'' +
                ", production=" + production +
                ", posterPath='" + posterPath + '\'' +
                ", credits=" + credits +
                ", originalName='" + originalName + '\'' +
                ", overview='" + overview + '\'' +
                ", id=" + id +
                ", popularity=" + popularity +
                '}';
    }
}
