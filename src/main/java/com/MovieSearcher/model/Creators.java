package com.MovieSearcher.model;

public class Creators extends Celebrity {

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", profilePath='" + profilePath + '\'' +
                '}';
    }
}
