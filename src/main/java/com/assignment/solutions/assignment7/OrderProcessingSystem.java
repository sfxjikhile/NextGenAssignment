package com.assignment.solutions.assignment7;

import java.util.Scanner;

interface Furniture {
    double getPrice();
    void setPrice(double price);
    double getWidth();
    void setWidth(double width);
    double getHeight();
    void setHeight(double height);
    }

    class Chair implements Furniture {
        private double price;
        private double height;
        private double width;
        private int numOfLegs;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public int getNumOfLegs() {
            return numOfLegs;
        }

        public void setNumOfLegs(int numOfLegs) {
            this.numOfLegs = numOfLegs;
        }
    }

    class Bookshelf implements Furniture {
        private double price;
        private double width;
        private double height;
        private int numOfShelves;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public int getNumOfShelves() {
            return numOfShelves;
        }

        public void setNumOfShelves(int numOfShelves) {
            this.numOfShelves = numOfShelves;
        }
    }

    public class OrderProcessingSystem { // main class
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Furniture furniture = null;

            while (true) {
                // ask user for choice of furniture
                System.out.print("Furniture available for order: \n1. Chair \n2. Bookshelf\n");
                String furnitureType = scanner.nextLine();
                // create instance of furniture type
                if (furnitureType.equalsIgnoreCase("chair")) {
                    furniture = new Chair();
                    try {
                        System.out.print("Enter the price of the chair: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        furniture.setPrice(price);

                        System.out.print("Enter the height of the chair: ");
                        double height = Double.parseDouble(scanner.nextLine());
                        furniture.setHeight(height);

                        System.out.print("Enter the width of the chair: ");
                        double width = Double.parseDouble(scanner.nextLine());
                        furniture.setWidth(width);

                        System.out.print("Enter the number of legs for the chair: ");
                        int numOfLegs = Integer.parseInt(scanner.nextLine());
                        ((Chair) furniture).setNumOfLegs(numOfLegs);

                        break; // exit

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid last option. Pls use the numeric keypad.");
                    }

                } else if (furnitureType.equalsIgnoreCase("bookshelf")) {
                    furniture = new Bookshelf();
                    try {
                        System.out.print("Enter the price of the bookshelf: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        furniture.setPrice(price);

                        System.out.print("Enter the height of the bookshelf: ");
                        double height = Double.parseDouble(scanner.nextLine());
                        furniture.setHeight(height);

                        System.out.print("Enter the width of the bookshelf: ");
                        double width = Double.parseDouble(scanner.nextLine());
                        furniture.setWidth(width);

                        System.out.print("Enter the number of shelves for the bookshelf: ");
                        int numOfShelves = Integer.parseInt(scanner.nextLine());
                        ((Bookshelf) furniture).setNumOfShelves(numOfShelves);

                        break;


                    } catch (NumberFormatException e) {
                        System.out.println("Invalid last option. Pls use the numeric keypad.");
                    }

                } else {
                    System.out.println("We Are Only Accepting Chair & Bookshelf Orders ");
                }

        // to display customer's order
        System.out.println("Your chosen furniture: " + furniture.getClass().getSimpleName());
        System.out.println("Price: " + furniture.getPrice());
        System.out.println("Width: " + furniture.getWidth());
        System.out.println("Height: " + furniture.getHeight());

        if (furniture instanceof Chair) {
            System.out.println("Number of legs: " + ((Chair) furniture).getNumOfLegs());
        } else if (furniture instanceof Bookshelf) {
            System.out.println("Number of shelves: " + ((Bookshelf) furniture).getNumOfShelves());
            }
        }
    }
}
