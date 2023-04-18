package com.assignment.solutions.assignment8.book;

import java.util.Scanner;

public class SoftwareBook implements Book {
    private String authorName;
    private String title;
    private double price;
    private int numberOfPages;
    private int stock;
    private String softwareName;
    private String softwareVersion;

    public void getBookDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author's name: ");
        authorName = input.next();
        System.out.println("Enter book title: ");
        title = input.next();
        System.out.println("Enter book price: ");
        price = input.nextDouble();
        System.out.println("Enter stock: ");
        stock = input.nextInt();
        System.out.println("Enter number of pages:");
        numberOfPages = input.nextInt();
        System.out.println("Enter software name: ");
        softwareName = input.next();
        System.out.println("Enter software version: ");
        softwareVersion = input.next();
    }

    public void showBookDetails() {
        System.out.println("Author's name is: " + authorName);
        System.out.println("The title of the book  is: " + title);
        System.out.println("The price of the book is: " + price);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Stock is: " + stock);
        System.out.println("Software name is: " + softwareName);
        System.out.println("Software version: " + softwareVersion);
    }
}
