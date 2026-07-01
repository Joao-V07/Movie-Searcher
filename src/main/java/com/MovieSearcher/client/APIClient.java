package com.MovieSearcher.client;

import com.MovieSearcher.config.AppConfig;
import com.MovieSearcher.config.ConfigReader;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class APIClient {
    private final String token;
    private final static String baseUrl = "https://api.themoviedb.org/3/";
    private final OkHttpClient client;

    public APIClient() {
        this.token = ConfigReader.getKey("tmdb.token");
        this.client = new OkHttpClient();
    }

    public String makeRequest(String endpoint) {
        String url = baseUrl + endpoint + "&language=" + AppConfig.getLanguage();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", token)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException("error with API request", e);
        }
    }
}
