package com.assignment.solutions.assignment10;

import java.io.*;
import java.util.Scanner;

public class BookDetails {

    Scanner sc = new Scanner(System.in);

    public void selections() {
        System.out.println("1. Input Book Details \n2. Display Book Details\n \n Enter Either 1 0r 2");
        System.out.print(">>");
        int input =sc.nextInt();
        switch(input){
            case 1:
                bookDetails();
                selections();
                break;
            case 2:
                displayBookDetails();
                break;

        }
    }

    public void bookDetails() {

        try(BufferedWriter fw = new BufferedWriter(new FileWriter("book.txt"))){
            System.out.println("Enter Book Name : ");
            String bookName = sc.next();
            fw.write("\nBook Name : " + bookName);

            System.out.println("Enter Author Name : ");
            String authorName = sc.next();
            fw.write("\nAuthor Name : " + authorName);

            System.out.println("Enter Price : ");
            double price = sc.nextDouble();
            fw.write("\nAuthor Name : " +  price );

        }catch (IOException e) {
            System.out.println("I/O ERROR: " + e);
        }
    }

    public void displayBookDetails(){
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("book.txt"))) {
            System.out.println("......................................");
            System.out.println(".............Book Detail..............");
            System.out.println("......................................");

            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }


    public static void main(String[] args) {
        BookDetails bk = new BookDetails();
        bk.selections();
    }
}
