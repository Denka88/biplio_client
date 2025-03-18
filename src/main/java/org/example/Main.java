package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.example.entity.*;
import org.example.service.HttpService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ObjectMapper mapper = new ObjectMapper();

        Menu menu = new Menu();
        menu.getMenu();

        /*do {
            System.out.println("\n\nВыберите действие: ");
            System.out.println("1 - Получить список всех авторов");
            System.out.println("2 - Получить автора по id");
            System.out.println("3 - Получить список всех книг");
            System.out.println("4 - Получить книгу по id");
            System.out.println("5 - Получить список всех городов");
            System.out.println("6 - Получить город по id");
            System.out.println("7 - Получить список всех жанров");
            System.out.println("8 - Получить жанр по id");
            System.out.println("9 - Получить список всех издательств");
            System.out.println("10 - Получить издательство по id");
            System.out.println("0 - Выход");

            System.out.print("Выбор действия: ");
            int action = scan.nextInt();

            switch (action) {
                case 0: {
                    System.out.println("Выход из программы");
                    return;
                }
                case 1: {
                    String allAuthorsJson = HttpService.get("http://localhost:8080/api/v1/author/all");
                    Object dataAuthorsList = JsonPath.read(allAuthorsJson, "$.data[*]");
                    List<Author> authors = mapper.convertValue(dataAuthorsList, new TypeReference<List<Author>>() {});
                    for (Author author : authors) {
                        System.out.println(author.toString());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите id автора: ");
                    int id = scan.nextInt();
                    String authorJson = HttpService.get("http://localhost:8080/api/v1/author?id=", id);
                    Object dataAuthor = JsonPath.read(authorJson, "$.data");
                    Author author = mapper.convertValue(dataAuthor, Author.class);
                    System.out.println(author.toString());
                    break;
                }
                case 3: {
                    String allBooksJson = HttpService.get("http://localhost:8080/api/v1/book/all");
                    Object dataBooksList = JsonPath.read(allBooksJson, "$.data[*]");
                    List<Book> books = mapper.convertValue(dataBooksList, new TypeReference<List<Book>>() {});
                    for (Book book : books) {
                        System.out.println(book.toString());
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите id книги: ");
                    int id = scan.nextInt();
                    String bookJson = HttpService.get("http://localhost:8080/api/v1/book?id=", id);
                    Object dataBook = JsonPath.read(bookJson, "$.data");
                    Book book = mapper.convertValue(dataBook, Book.class);
                    System.out.println(book.toString());
                    break;
                }
                case 5: {
                    String allCitiesJson = HttpService.get("http://localhost:8080/api/v1/city/all");
                    Object dataCitiesList = JsonPath.read(allCitiesJson, "$.data[*]");
                    List<City> cities = mapper.convertValue(dataCitiesList, new TypeReference<List<City>>() {});
                    for (City city : cities) {
                        System.out.println(city.toString());
                    }
                    break;
                }
                case 6: {
                    System.out.println("Введите id города: ");
                    int id = scan.nextInt();
                    String cityJson = HttpService.get("http://localhost:8080/api/v1/city?id=", id);
                    Object dataCity = JsonPath.read(cityJson, "$.data");
                    City city = mapper.convertValue(dataCity, City.class);
                    System.out.println(city.toString());
                    break;
                }
                case 7: {
                    String allGenresJson = HttpService.get("http://localhost:8080/api/v1/genre/all");
                    Object dataGenresList = JsonPath.read(allGenresJson, "$.data[*]");
                    List<Genre> genres = mapper.convertValue(dataGenresList, new TypeReference<List<Genre>>() {});
                    for (Genre genre : genres) {
                        System.out.println(genre.toString());
                    }
                    break;
                }
                case 8: {
                    System.out.println("Введите id жанра: ");
                    int id = scan.nextInt();
                    String genreJson = HttpService.get("http://localhost:8080/api/v1/genre?id=", id);
                    Object dataGenre = JsonPath.read(genreJson, "$.data");
                    Genre genre = mapper.convertValue(dataGenre, Genre.class);
                    System.out.println(genre.toString());
                    break;
                }
                case 9: {
                    String allPublishersJson = HttpService.get("http://localhost:8080/api/v1/publisher/all");
                    Object dataPublishersList = JsonPath.read(allPublishersJson, "$.data[*]");
                    List<Publisher> publishers = mapper.convertValue(dataPublishersList, new TypeReference<List<Publisher>>() {});
                    for (Publisher publisher : publishers) {
                        System.out.println(publisher.toString());
                    }
                    break;
                }
                case 10: {
                    System.out.println("Введите id издательства: ");
                    int id = scan.nextInt();
                    String publisherJson = HttpService.get("http://localhost:8080/api/v1/publisher?id=", id);
                    Object dataPublisher = JsonPath.read(publisherJson, "$.data");
                    Publisher publisher = mapper.convertValue(dataPublisher, Publisher.class);
                    System.out.println(publisher.toString());
                    break;
                }
                default: {
                    System.out.println("Нет такого действия!");
                    break;
                }
            }
        }while (true);*/
    }
}