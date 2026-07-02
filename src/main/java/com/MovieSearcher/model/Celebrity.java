package com.MovieSearcher.model;

import java.util.List;

public class Celebrity extends MediaItem {
    private int age;
    private String birthday;
    private String deathday;
    private int gender;
    private List<String> knownFor;
    private String knownForDept;
    private String placeBirth;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDeathday() {
        return deathday;
    }

    public void setDeathday(String deathday) {
        this.deathday = deathday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public List<String> getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(List<String> knownFor) {
        this.knownFor = knownFor;
    }

    public String getKnownForDept() {
        return knownForDept;
    }

    public void setKnownForDept(String knownForDept) {
        this.knownForDept = knownForDept;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }
}
