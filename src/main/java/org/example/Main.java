package org.example;

import org.example.service.HttpService;

public class Main {
    public static void main(String[] args) {

        System.out.println(HttpService.get("http://localhost:8080/api/v1/book/all"));

    }
}