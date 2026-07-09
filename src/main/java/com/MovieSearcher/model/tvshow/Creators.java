package com.MovieSearcher.model.tvshow;

import com.MovieSearcher.model.celebrity.Celebrity;

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
