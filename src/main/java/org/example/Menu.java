package org.example;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void getMenu(){
        System.out.println("╦Главное меню╦");
        System.out.println("║1. Работа с авторами║");
        System.out.println("║2. Работа с книгами║");
        System.out.println("║3. Работа с городами║");
        System.out.println("║4. Работа с жанрами║");
        System.out.println("║5. Работа с издательствами║");
        System.out.println("║0. Выход║");

        int choise = scanner.nextInt();

        switch (choise){
            case 0:{

            }
        }
    }

    public void getAuthorsMenu(){
        System.out.println("╦Главное меню╦");
        System.out.println("║1. Получить список всех авторов║");
        System.out.println("║2. Получить автора по id║");
        System.out.println("║0. Назад║");
    }

}
