package com.MovieSearcher.config;

public class AppConfig {
    private static String language = "en_US";

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        AppConfig.language = language;
    }
}
