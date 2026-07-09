package com.MovieSearcher.controller;

import com.MovieSearcher.model.celebrity.Celebrity;
import com.MovieSearcher.model.movie.Movie;
import com.MovieSearcher.model.tvshow.TVShow;

import java.util.List;

public class SearchResults {
    private final List<Movie> movie;
    private final List<Celebrity> celebrity;
    private final List<TVShow> tvShow;

    public SearchResults(List<Movie> movie, List<Celebrity> celebrity, List<TVShow> tvShow) {
        this.movie = movie;
        this.celebrity = celebrity;
        this.tvShow = tvShow;
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public List<Celebrity> getCelebrity() {
        return celebrity;
    }

    public List<TVShow> getTvShow() {
        return tvShow;
    }

    @Override
    public String toString() {
        return "SearchResults{" +
                "movie=" + movie +
                ", celebrity=" + celebrity +
                ", tvShow=" + tvShow +
                '}';
    }
}
