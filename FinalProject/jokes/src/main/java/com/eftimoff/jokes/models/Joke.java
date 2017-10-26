package com.eftimoff.jokes.models;

public final class Joke {

    private String title;
    private String description;

    public Joke(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
