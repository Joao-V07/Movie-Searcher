package com.MovieSearcher.model.shared;

import com.MovieSearcher.model.celebrity.Celebrity;

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
                ", gender=" + gender +
                '}';
    }
}
