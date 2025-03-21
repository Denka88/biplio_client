package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Publisher {

    @JsonProperty("id")
    private int id;
    
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("city")
    private City city;

    public Publisher() {
    }

    public Publisher(String title, City city) {
        this.title = title;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Издатель: " + id + " " + title + " " + city.toString();
    }
}
