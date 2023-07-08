package com.nextgen.assignment8b;
import java.util.Scanner;
public class Library extends Books implements BookInfo {
    String softwareVersion;
    String softwareName;
    String hardwareCategory;
    String publisher;
    public void softwareInfo() {
        Scanner print = new Scanner(System.in);
        super.bookDetails();
        System.out.print("Software version: ");
        softwareVersion = print.nextLine();
        System.out.print("Software name: ");
        softwareName = print.nextLine();
        showData();
    }
    public void showData() {
        System.out.println("This are the book information: ");
        System.out.println("Author name is: " + super.authorName);
        System.out.println("Title of the book is: " + super.title);
        System.out.println("The price of the book is: " + super.price);
        System.out.println("Book stock is: " + super.stock);
        System.out.println("The number of pages of the book is: " + super.numberOfPages);
        System.out.println("Software version is: " + softwareVersion);
        System.out.println("Software name is: " + softwareName);
    }
    @Override
    public void hardwareInfo() {
        Scanner start = new Scanner(System.in);
        super.bookDetails();
        System.out.print("Hardware category: ");
        hardwareCategory = start.nextLine();
        System.out.print("Publisher: ");
        publisher = start.nextLine();
        showInfo();
    }
    public void showInfo() {
        System.out.println("This are the book information: ");
        System.out.println("Author name is: " + super.authorName);
        System.out.println("Title of the book is: " + super.title);
        System.out.println("The price of the book is: " + super.price);
        System.out.println("Book stock is: " + super.stock);
        System.out.println("number of pages of the book is: " + super.numberOfPages);
        System.out.println("Hardware category is: " + hardwareCategory);
        System.out.println("Publisher of the book is: " + publisher);
    }
    public static void main(String[] args) {
        Library lib = new Library();
        int selection;
        Scanner option = new Scanner(System.in);
        do {
            System.out.println(("1: to enter software books details\n2: to enter hardware book details\n3:" +
                    " to exit app").toUpperCase());
            selection = option.nextInt();
            switch (selection) {
                case 1:
                    lib.softwareInfo();
                    break;
                case 2:
                    lib.hardwareInfo();
                    break;
                case 3:
                    System.out.println("thank you, goodbye...");
                    break;
                default:
                    System.out.println("incorrect input, try again");
            }
        } while (selection != 3);

    }
}