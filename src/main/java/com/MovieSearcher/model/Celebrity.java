package com.MovieSearcher.model;

public class Celebrity extends MediaItem {
    private int age;
    private String dateOfBirth;

    public Celebrity(String name) {
        super(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
