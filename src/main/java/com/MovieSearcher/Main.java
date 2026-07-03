package com.MovieSearcher;

import com.MovieSearcher.client.APIClient;
import com.MovieSearcher.service.MovieService;

public class Main {
    public static void main(String[] args) {
        APIClient client = new APIClient();
        MovieService movieService = new MovieService(client);
        System.out.println(movieService.search("Obsession").toString());
        System.out.println(movieService.searchDetails(1339713));

    }
}
