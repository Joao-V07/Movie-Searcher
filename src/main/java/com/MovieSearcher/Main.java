package com.MovieSearcher;

import com.MovieSearcher.client.APIClient;
import com.MovieSearcher.controller.Controller;
import com.MovieSearcher.service.CelebrityService;
import com.MovieSearcher.service.MovieService;
import com.MovieSearcher.service.TVService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ui/SearchView.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Movie Searcher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
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
