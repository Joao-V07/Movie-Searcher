package com.MovieSearcher.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Celebrity extends MediaItem {
    protected String name;
    protected int age;
    protected String birthday;
    protected String deathday;
    protected int gender;
    @SerializedName("combined_credits")
    protected CombinedCredits knownFor;
    @SerializedName("known_for_department")
    protected String knownForDept;
    @SerializedName("place_of_birth")
    protected String placeBirth;
    protected String profilePath;
    protected String biography;

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Celebrity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", deathday='" + deathday + '\'' +
                ", gender=" + gender +
                ", knownFor=" + knownFor.getCast() + knownFor.getCrew() +
                ", knownForDept='" + knownForDept + '\'' +
                ", placeBirth='" + placeBirth + '\'' +
                ", profilePath='" + profilePath + '\'' +
                ", biography='" + biography + '\'' +
                ", id=" + id +
                ", popularity=" + popularity +
                '}';
    }


}
