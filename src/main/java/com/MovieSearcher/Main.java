package com.MovieSearcher;

import com.MovieSearcher.client.APIClient;

public class Main {
    public static void main(String[] args) {
        APIClient client = new APIClient();
        System.out.println(client.makeRequest("movie/1339713"));
    }
}
