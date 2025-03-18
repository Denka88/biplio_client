package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    
    @JsonProperty("author")
    private Author author;
    @JsonProperty("publisher")
    private Publisher publisher;
    @JsonProperty("genre")
    private Genre genre;
    @JsonProperty("year")
    private String year;

    public Book() {
    }

    public Book(Author author, Publisher publisher, Genre genre, String year) {
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга: " + year + ", " + author.toString() + ", " + publisher.toString() + ", " + genre.toString();
    }
}
