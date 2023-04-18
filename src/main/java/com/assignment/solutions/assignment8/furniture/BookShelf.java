package com.assignment.solutions.assignment8.furniture;

import java.util.Scanner;

public class BookShelf implements Furniture {
    private double price;
    private double width;
    private double height;
    private int numberOfShelves;
    
    @Override
    public void getFurnitureDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width of book shelf (inches): ");
        width = input.nextDouble();
        System.out.print("Enter height of book shelf (inches): ");
        height = input.nextDouble();
        System.out.print("Enter price of book shelf (USD): ");
        price = input.nextDouble();

        System.out.print("Enter the number of shelves: ");
        numberOfShelves = input.nextInt();
    }

    @Override
    public void displayFurnitureDetails() {
        System.out.println("\nDetails of the Book Shelf are as follows:");
        System.out.println("Width of book shelf: " + width);
        System.out.println("Height of book shelf: " + height);
        System.out.println("Price of book shelf: " + price);
        System.out.println("Number of shelves: " + numberOfShelves);
    }
}
