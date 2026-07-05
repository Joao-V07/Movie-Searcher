package com.MovieSearcher.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Celebrity extends MediaItem {
    protected String name;
    protected int age;
    protected String birthday;
    protected String deathday;
    protected int gender;
    protected List<String> knownFor;
    @SerializedName("known_for_department")
    protected String knownForDept;
    protected String placeBirth;
    protected String picturePath;

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
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

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", deathday='" + deathday + '\'' +
                ", gender=" + gender +
                ", knownFor=" + knownFor +
                ", knownForDept='" + knownForDept + '\'' +
                ", placeBirth='" + placeBirth + '\'' +
                ", picturePath='" + picturePath + '\'' +
                ", id=" + id +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
