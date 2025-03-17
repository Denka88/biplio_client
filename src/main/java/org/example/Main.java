package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.example.service.HttpService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String authorJson = HttpService.get("http://localhost:8080/api/v1/author?id=1");
        String cityJson = HttpService.get("http://localhost:8080/api/v1/city?id=1");
        String genreJson = HttpService.get("http://localhost:8080/api/v1/genre?id=1");
        String publisherJson = HttpService.get("http://localhost:8080/api/v1/publisher?id=10");
        String bookJson = HttpService.get("http://localhost:8080/api/v1/book?id=1");

        ObjectMapper mapper = new ObjectMapper();
        
        Object dataAuthor = JsonPath.read(authorJson, "$.data");
        Object dataCity = JsonPath.read(cityJson, "$.data");
        Object dataGenre = JsonPath.read(genreJson, "$.data");
        Object dataPublisher = JsonPath.read(publisherJson, "$.data");
        Object dataBook = JsonPath.read(bookJson, "$.data");
        
        Author author = mapper.convertValue(dataAuthor, Author.class);
        System.out.println(author.toString());
        
        City city = mapper.convertValue(dataCity, City.class);
        System.out.println(city.toString());
        
        Genre genre = mapper.convertValue(dataGenre, Genre.class);
        System.out.println(genre.toString());
        
        Publisher publisher = mapper.convertValue(dataPublisher, Publisher.class);
        System.out.println(publisher.toString());

        Book book = mapper.convertValue(dataBook, Book.class);
        System.out.println(book.toString());
    }
}