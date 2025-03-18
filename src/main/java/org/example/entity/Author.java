package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {

    @JsonProperty("id")
    private int id;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("surName")
    private String surName;

    public Author() {
    }

    public Author(String lastName, String name, String surName) {
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Автор: "+ id + " " + name + " " + lastName + " " + surName;
    }
}
