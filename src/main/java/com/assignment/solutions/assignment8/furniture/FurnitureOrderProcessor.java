package com.assignment.solutions.assignment8.furniture;

import java.util.Scanner;

public class FurnitureOrderProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to FFC order processing system!");
        System.out.println("Please choose the furniture item you want to order:");
        System.out.println("1. Chair");
        System.out.println("2. Bookshelf");

        // Get the user's choice
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Chair chair = new Chair();
                chair.getFurnitureDetails();
                chair.displayFurnitureDetails();
                break;
            case 2:
                BookShelf bookShelf = new BookShelf();
                bookShelf.getFurnitureDetails();
                bookShelf.displayFurnitureDetails();
                break;
            default:
                System.out.println("Invalid input \n Program is exiting now...");
                System.exit(0);
        }
    }
}
