package com.nextgen.assignment10a;
/*You need to write a program which provides an option to either input the book details or display the book details.
        In addition, on selecting the input option, the book details, such as the book name, author name, and price,
        should be accepted and written into a text file. Further, if the display option is selected,
        all the book details should be displayed.*/

import java.io.*;
import java.util.Scanner;
public class BookData {
    String book;
    String bookName;
    String authorName;
    String price;
    String read;
    static int select;
    BufferedReader bk = new BufferedReader(new InputStreamReader(System.in));

    public void bookDetails() {
        try (FileWriter input = new FileWriter("New.txt")) {
            do {
                System.out.print("Book name:  ");
                bookName = bk.readLine();
                bookName = "Book Name: " + bookName + "\r\n";
                input.write(bookName);
                System.out.print("Author name: ");
                authorName = bk.readLine();
                authorName = "Author Name: " + authorName + "\r\n";
                input.write(authorName);
                System.out.print("Price of the book: ");
                price = bk.readLine();
                price = "Price of the book: " + price + "\r\n";
                input.write(price);
                System.out.println("enter done to end the input");
                book = bk.readLine();
                if (book.compareTo("done") == 0)
                    break;
                book = book + "\r\n";
                input.write(book);
            } while (book.compareTo("done") != 0);
        } catch (IOException exp) {
            System.out.println("Error " + exp);
        }
    }
    void displayDetails() {
        try (BufferedReader br = new BufferedReader(new FileReader("New.txt"))) {
            System.out.println("The book details you entered are:".toUpperCase());
            while ((read = br.readLine()) != null) {
                System.out.println(read);
            }
        } catch (IOException exp) {
            System.out.println("I/O Error" + exp);
        }
    }

    public static void displayMenu() {
        System.out.println("Select an option");
        System.out.println("1: To Enter Book Details\n2: To Display The Details\n3: To exit app");
    }

    public static void main(String[] args) {
        BookData bookData = new BookData();
        Scanner sc = new Scanner(System.in);
        try {
            do {
                displayMenu();
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        bookData.bookDetails();
                        break;
                    case 2:
                        bookData.displayDetails();
                        break;
                    case 3:
                        System.out.println("logging out....\nthank you");
                        break;
                    default:
                        System.out.println("invalid input,...try again");
                }
            } while (select != 3);
        } catch (Exception exp) {
            System.out.println("error" + exp);
        }
    }
}
