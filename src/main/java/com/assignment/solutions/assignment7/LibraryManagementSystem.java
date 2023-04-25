package com.assignment.solutions.assignment7;

import java.util.Scanner;

interface Book {
    String getAuthorName();
    void setAuthorName(String authorName);
    String getTitle();
    void setTitle(String title);
    double getPrice();
    void setPrice(double price);
    int getNumOfPages();
    void setNumOfPages(int numOfPages);
    int getStock();
    void setStock(int stock);
    }

    class SoftwareBook implements Book {
        private String authorName;
        private String title;
        private double price;
        private int numOfPages;
        private int stock;
        private String softwareVersion;
        private String softwareName;

        public String getAuthorName() {
            return authorName;
        }
        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getNumOfPages() {
            return numOfPages;
        }
        public void setNumOfPages(int numOfPages) {
            this.numOfPages = numOfPages;
        }
        public int getStock() {
            return stock;
        }
        public void setStock(int stock) {
            this.stock = stock;
        }
        public String getSoftwareVersion() {
            return softwareVersion;
        }
        public void setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
        }
        public String getSoftwareName() {
            return softwareName;
        }
        public void setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
        }
    }

    class HardwareBook implements Book {
        private String authorName;
        private String title;
        private double price;
        private int numOfPages;
        private int stock;
        private String hardwareCategory;
        private String publisher;

        public String getAuthorName() {
            return authorName;
        }
        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getNumOfPages() {
            return numOfPages;
        }
        public void setNumOfPages(int numOfPages) {
            this.numOfPages = numOfPages;
        }
        public int getStock() {
            return stock;
        }
        public void setStock(int stock) {
            this.stock = stock;
        }
        public String getHardwareCategory() {
            return hardwareCategory;
        }
        public void setHardwareCategory(String hardwareCategory) {
            this.hardwareCategory = hardwareCategory;
        }
        public String getPublisher() {
            return publisher;
        }
        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }
    }


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = null;

        while (true){
            // ask user for book category
            System.out.print("What type of book do you want to add? Software or Hardware:");
            String bookCategory = scanner.nextLine();
            // create instance of customer's choice
            if (bookCategory.equalsIgnoreCase("software")) {
                book = new SoftwareBook();
                try {
                    System.out.print("Enter the author name of the book: ");
                    String authorName = scanner.nextLine();
                    book.setAuthorName(authorName);

                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    book.setTitle(title);

                    System.out.print("Enter the price: ");
                    double price = scanner.nextDouble();
                    book.setPrice(price);

                    System.out.print("Enter the number of pages: ");
                    int numOfPages = scanner.nextInt();
                    book.setNumOfPages(numOfPages);

                    System.out.print("Enter the stock quantity: ");
                    int stock = scanner.nextInt();
                    book.setStock(stock);

                    System.out.print("Enter the software version: ");
                    scanner.nextLine();
                    String softwareVersion = scanner.nextLine();
                    ((SoftwareBook) book).setSoftwareVersion(softwareVersion);

                    System.out.print("Enter the software name: ");
                    String softwareName = scanner.nextLine();
                    ((SoftwareBook) book).setSoftwareName(softwareName);

                    break;

                } catch (Exception e) {
                    System.out.println("Error occurred: " + e.getMessage());
                }

            } else if (bookCategory.equalsIgnoreCase("hardware")) {
                book = new HardwareBook();
                try {
                    System.out.print("Enter the author name of the book: ");
                    String authorName = scanner.nextLine();
                    book.setAuthorName(authorName);

                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    book.setTitle(title);

                    System.out.print("Enter the price: ");
                    double price = scanner.nextDouble();
                    book.setPrice(price);

                    System.out.print("Enter the number of pages: ");
                    int numOfPages = scanner.nextInt();
                    book.setNumOfPages(numOfPages);

                    System.out.print("Enter the stock quantity: ");
                    int stock = scanner.nextInt();
                    book.setStock(stock);

                    System.out.print("Enter the hardware category: ");
                    scanner.nextLine();
                    String hardwareCategory = scanner.nextLine();
                    ((HardwareBook) book).setHardwareCategory(hardwareCategory);

                    System.out.print("Enter the publisher: ");
                    String publisher = scanner.nextLine();
                    ((HardwareBook) book).setPublisher(publisher);

                    break;

                } catch (Exception e) {
                    System.out.println("Error occurred: " + e.getMessage());
                }

            } else {
                System.out.println("Invalid book category entered.");
            }

        //To display book selected complete details
        System.out.println("Author: " + book.getAuthorName());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Number of pages: " + book.getNumOfPages());
        System.out.println("Stock: " + book.getStock());
        if (book instanceof SoftwareBook) {
            System.out.println("Software version: " + ((SoftwareBook) book).getSoftwareVersion());
            System.out.println("Software name: " + ((SoftwareBook) book).getSoftwareName());
        } else if (book instanceof HardwareBook) {
            System.out.println("Hardware category: " + ((HardwareBook) book).getHardwareCategory());
            System.out.println("Publisher: " + ((HardwareBook) book).getPublisher());
        }
    }
    }
}

