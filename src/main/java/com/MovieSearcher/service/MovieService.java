package com.MovieSearcher.service;

import com.MovieSearcher.client.APIClient;
import com.MovieSearcher.model.APIResponse;
import com.MovieSearcher.model.Movie;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MovieService {
    private final Gson gson;
    private final APIClient apiClient;

    public MovieService(APIClient apiClient) {
        this.gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        this.apiClient = apiClient;
    }

    public List<Movie> search(String query) {
        String json = apiClient.makeRequest("search/movie?query=" + query);
        Type type = new TypeToken<APIResponse<Movie>>(){}.getType();
        APIResponse<Movie> response = gson.fromJson(json, type);

        return response.getResults();
    }

    public Movie searchDetails(int id) {
        String json = apiClient.makeRequest("movie/" + id + "?append_to_response=credits");

        return gson.fromJson(json, Movie.class);
    }


}
