package com.assignment.solutions.assignment8.furniture;

import java.util.Scanner;

public class Chair implements Furniture {
    private double price;
    private double width;
    private double height;
    private int numberOfLegs;

    public void getFurnitureDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width of chair (inches): ");
        width = input.nextDouble();
        System.out.print("Enter height of chair (inches): ");
        height = input.nextDouble();
        System.out.print("Enter price of chair (USD): ");
        price = input.nextDouble();
        System.out.print("Enter the number of legs: ");
        numberOfLegs = input.nextInt();
    }

    @Override
    public void displayFurnitureDetails() {
        System.out.println("\nDetails of the Chair are as follows:");
        System.out.println("Width of chair: " + width);
        System.out.println("Height of chair: " + height);
        System.out.println("Price of chair: " + price);
        System.out.println("Number of legs: " + numberOfLegs);
    }
}
