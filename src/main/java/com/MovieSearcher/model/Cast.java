package com.MovieSearcher.model;

public class Cast extends Celebrity{
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
