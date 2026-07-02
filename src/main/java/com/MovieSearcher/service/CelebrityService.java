package com.MovieSearcher.service;

import com.MovieSearcher.client.APIClient;
import com.MovieSearcher.model.APIResponse;
import com.MovieSearcher.model.Celebrity;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class CelebrityService {
    private final Gson gson;
    private final APIClient apiClient;


    public CelebrityService(APIClient apiClient) {
        this.gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        this.apiClient = apiClient;
    }

    public List<Celebrity> search(String query) {
        String json = apiClient.makeRequest("search/person?query=" + query);
        Type type = new TypeToken<APIResponse<Celebrity>>(){}.getType();
        APIResponse<Celebrity> response = gson.fromJson(json, type);

        return response.getResults();
    }

    public Celebrity searchDetails(int id){
        String json = apiClient.makeRequest("person/" + id);

        return gson.fromJson(json, Celebrity.class);
    }
}
