package com.MovieSearcher.model.shared;

import com.MovieSearcher.model.celebrity.Celebrity;

public class Cast extends Celebrity {
    private String character;
    private int order;


    public String getCharacter() {
        return character;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "character='" + character + '\'' +
                ", name='" + name + '\'' +
                ", knownForDept='" + knownForDept + '\'' +
                '}';
    }
}
