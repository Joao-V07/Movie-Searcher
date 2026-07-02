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

public class TVService {
    private final APIClient apiClient;
    private final Gson gson;

    public TVService(APIClient apiClient) {
        this.apiClient = apiClient;
        this.gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    }

    public List<TVService> search(String query){
        String json = apiClient.makeRequest("search/tv?query=" +  query);
        Type type = new TypeToken<APIResponse<TVService>>(){}.getType();
        APIResponse<TVService> response = gson.fromJson(json, type);

        return response.getResults();
    }

    public TVService searchDetails(int id) {
        String json = apiClient.makeRequest("tv/" + id);

        return gson.fromJson(json, TVService.class);
    }
}
