package com.MovieSearcher.model.shared;

import java.util.List;

public class APIResponse<T> {
    private int page;
    private List<T> results;
    private int totalPages;
    private int totalResults;

    public int getPage() {
        return page;
    }

    public List<T> getResults() {
        return results;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }
}
