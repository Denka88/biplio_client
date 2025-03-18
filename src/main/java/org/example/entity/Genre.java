package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Genre {

    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;

    public Genre() {
    }

    public Genre(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Жанр: " + id + " " + title;
    }
}
