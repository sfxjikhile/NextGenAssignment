package com.nextgen.assignment8b;
import java.util.Scanner;

/*author name title, price, stock,
    software version, software name, and number of pages,......author name, title, price, number of pages,
    stock, hardware category, and publisher, */
public class Books {
    String authorName;
    String title;
    String price;
    String stock;
    int numberOfPages;

    public void bookDetails() {
        Scanner start = new Scanner(System.in);
        System.out.print("Author name: ");
        authorName = start.nextLine();
        System.out.print("Title of the book: ");
        title = start.nextLine();
        System.out.print("Price of the book: ");
        price = start.nextLine();
        System.out.print("Book stock: ");
        stock = start.nextLine();
        System.out.print("Number of pages: ");
        numberOfPages = start.nextInt();}
}