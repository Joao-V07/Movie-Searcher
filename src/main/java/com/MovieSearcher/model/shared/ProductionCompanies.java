package com.MovieSearcher.model.shared;

public class ProductionCompanies {
    private int id;
    private String logoPath;
    private String name;
    private String originCountry;

    @Override
    public String toString() {
        return  "{ name= " + name +
                ", originCountry= " + originCountry +" }" ;
    }

    public int getId() {
        return id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getName() {
        return name;
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
