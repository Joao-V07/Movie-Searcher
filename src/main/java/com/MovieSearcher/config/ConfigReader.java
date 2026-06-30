package com.MovieSearcher.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties prop;

    static {
        prop = new Properties();
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")){
            prop.load(input);;
        }
     catch (IOException e) {
            throw new RuntimeException("Error while trying to load config.properties", e);
        }
    }

    public static String get(String key){
        return prop.getProperty(key);
    }
}
