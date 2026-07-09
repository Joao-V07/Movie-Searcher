package com.MovieSearcher;

import com.MovieSearcher.client.APIClient;
import com.MovieSearcher.controller.Controller;
import com.MovieSearcher.service.CelebrityService;
import com.MovieSearcher.service.MovieService;
import com.MovieSearcher.service.TVService;
import com.MovieSearcher.util.InputFormatter;

public class Main {
    public static void main(String[] args) {
        APIClient client = new APIClient();
        MovieService movieService = new MovieService(client);
        CelebrityService celebrityService = new CelebrityService(client);
        TVService TVService = new TVService(client);
        Controller controller = new Controller(movieService, celebrityService, TVService);
        //System.out.println(movieService.searchDetails(1339713));
        //System.out.println(celebrityService.searchDetails(1561370));
        //System.out.println(TVService.searchDetails(1421));
        //InputFormatter.formatInput("   Batman & Robin   ");
        //System.out.println(controller.searchAll("game of thrones"));
        //System.out.println(controller.searchCelebrityDetails(2121005));
    }
}
