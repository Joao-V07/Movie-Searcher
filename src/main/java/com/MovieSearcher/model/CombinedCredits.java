package com.MovieSearcher.model;

import java.util.List;

public class CombinedCredits {
    private List<CreditedWork> cast;
    private List<CreditedWork> crew;

    public List<CreditedWork> getCast() {
        return cast;
    }

    public void setCast(List<CreditedWork> cast) {
        this.cast = cast;
    }

    public List<CreditedWork> getCrew() {
        return crew;
    }

    public void setCrew(List<CreditedWork> crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "CombinedCredits{" +
                "cast=" + cast +
                ", crew=" + crew +
                '}';
    }
}
