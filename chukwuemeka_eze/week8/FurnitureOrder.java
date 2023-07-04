package week8;

import java.util.Scanner;

public class FurnitureOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept customer's choice
        System.out.println("Welcome to Furniture and Fittings Company (FFC)!");
        System.out.println("Please choose a furniture item:");
        System.out.println("1. Bookshelf");
        System.out.println("2. Chair");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();

        // Process customer's choice
        switch (choice) {
            case 1: // Bookshelf
                System.out.println("You have selected Bookshelf.");
                System.out.print("Enter the price of the bookshelf: ");
                double bookshelfPrice = scanner.nextDouble();
                System.out.print("Enter the width of the bookshelf: ");
                double bookshelfWidth = scanner.nextDouble();
                System.out.print("Enter the height of the bookshelf: ");
                double bookshelfHeight = scanner.nextDouble();
                // Process bookshelf attributes and display them
                System.out.println("Bookshelf attributes:");
                System.out.println("Price: " + bookshelfPrice);
                System.out.println("Width: " + bookshelfWidth);
                System.out.println("Height: " + bookshelfHeight);
                break;
            case 2: // Chair
                System.out.println("You have selected Chair.");
                System.out.print("Enter the price of the chair: ");
                double chairPrice = scanner.nextDouble();
                // Process chair attributes and display them
                System.out.println("Chair attributes:");
                System.out.println("Price: " + chairPrice);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }
}

