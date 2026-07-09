package com.MovieSearcher.controller;

import com.MovieSearcher.model.celebrity.Celebrity;
import com.MovieSearcher.model.movie.Movie;
import com.MovieSearcher.model.tvshow.TVShow;
import com.MovieSearcher.service.CelebrityService;
import com.MovieSearcher.service.MovieService;
import com.MovieSearcher.service.TVService;
import com.MovieSearcher.util.InputFormatter;
import java.util.List;

public class Controller {
    private final MovieService movieService;
    private final CelebrityService celebrityService;
    private final TVService tvService;

    public Controller (MovieService movieService, CelebrityService celebrityService, TVService tvService){
        this.celebrityService = celebrityService;
        this.movieService = movieService;
        this.tvService = tvService;
    }

    public SearchResults searchAll(String input) {
        String formatted = InputFormatter.formatInput(input);
        List<Movie> movies = movieService.search(formatted);
        List<Celebrity> celebrities = celebrityService.search(formatted);
        List<TVShow> tvShows = tvService.search(formatted);
        return new SearchResults(movies, celebrities, tvShows);
    }

    public Movie searchMovieDetails(int id) {
        return movieService.searchDetails(id);
    }

    public Celebrity searchCelebrityDetails(int id) {
        return celebrityService.searchDetails(id);
    }

    public TVShow searchTVShowDetails(int id) {
        return tvService.searchDetails(id);
    }
}
