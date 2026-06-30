package com.MovieSearcher.client;

import com.MovieSearcher.config.AppConfig;
import com.MovieSearcher.config.ConfigReader;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class APIClient {
    private static String token;
    private static String language;
    private static String baseUrl = "https://api.themoviedb.org/3/";

    public APIClient() {
        this.token = ConfigReader.get("tmdb.token");
        this.language = AppConfig.getLanguage();
        OkHttpClient client = new OkHttpClient();
    }

    public static String get(String endpoint) {
        String url = baseUrl + endpoint;

        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", token)
                .build();
    }
}
