package com.MovieSearcher.model;

public class Crew extends Celebrity {
    private String department;
    private String job;

    public String getJob() {
        return job;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "department='" + department + '\'' +
                ", job='" + job + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
