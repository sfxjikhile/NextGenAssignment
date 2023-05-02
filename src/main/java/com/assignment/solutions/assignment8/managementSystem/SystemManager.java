package com.assignment.solutions.assignment8.managementSystem;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class SystemManager extends ManagementSystem implements ManagerInterface {
   Scanner sc = new Scanner(System.in);
   Map<Integer, String> sm = new HashMap<>();

    public static final String RED= "\u001B[31m";
    public static final String BLUE= "\u001B[34m";
    public static final String RESET= "\u001B[0m";



   public void allBooks() {
        try{
            do{
                System.out.println(RESET +"1. SOFTWARE BOOKS \n2. HARDWARE BOOKS  \nEnter Either 1 or 2 below too access the book category:" );
                int input = sc.nextInt();
                switch(input) {
                    case 1 : softwareBook();
                        break;
                    case 2 : hardwareBook();
                        break;
                    default:
                        System.out.println(RED + "wrong input: try again......\n" );
                }
            }while (true);

        }catch(InputMismatchException e) {
            System.out.println(RED + "Something went Wrong: Mismatched");
            e.printStackTrace();
        }
   }

   public void softwareBook(){
       try{
           System.out.println("Enter Software Book Details");

           System.out.println("enter authors name:");
           String author = sc.next();
           setAuthor(author);
           sm.put(1,". Author: " + getAuthor());

           System.out.println("enter book title:");
           String title = sc.next();
           setTitle(title);
           sm.put(2, ". Title: " + getTitle());

           System.out.println("enter book price:");
           int price = sc.nextInt();
           setPrice(price);
           sm.put(3, ". Price: " + String.valueOf(getPrice()));

           System.out.println("enter stock:");
           int stock = sc.nextInt();
           setStock(stock);
           sm.put(4,". Stock: " + String.valueOf(getStock()));

           System.out.println("enter software version:");
           double version = sc.nextDouble();
           setSoftwareVersion(version);
           sm.put(5,". Version: " + String.valueOf(getSoftwareVersion()));

           System.out.println("enter software name:");
           String softwareName = sc.next();
           setSoftwareName(softwareName);
           sm.put(6,". software name: " + getSoftwareName());

           System.out.println("enter number of pages:");
           int pages = sc.nextInt();
           setNumberOfPages(pages);
           sm.put(7,". pages: " + String.valueOf(getNumberOfPages()));

           display();
       }catch(InputMismatchException e){
           System.out.println(RED + "Something Went Wrong: Input Mismatched");
       }
   }

    public void hardwareBook(){
       try{
           System.out.println("Enter Hardware Book Details");

           System.out.println("enter authors name:");
           String author = sc.next();
           setAuthor(author);
           sm.put(1,". Author: " + getAuthor());

           System.out.println("enter book title:");
           String title = sc.next();
           setTitle(title);
           sm.put(2, ". Title: " + getTitle());

           System.out.println("enter book price:");
           int price = sc.nextInt();
           setPrice(price);
           sm.put(3, ". Price: " + String.valueOf(getPrice()));

           System.out.println("enter stock:");
           int stock = sc.nextInt();
           setStock(stock);
           sm.put(4,". Stock: " + String.valueOf(getStock()));

           System.out.println("enter hardware category:");
           String category = sc.next();
           setHardwareCategory(category);
           sm.put(5, ". category: " + getHardwareCategory());

           System.out.println("enter publisher name:");
           String publisherName = sc.next();
           setPublisher(publisherName);
           sm.put(6, ". Publisher: " + getPublisher());

           System.out.println("enter number of pages:");
           int pages = sc.nextInt();
           setNumberOfPages(pages);
           sm.put(7,". pages: " + String.valueOf(getNumberOfPages()));

           display();

       }catch(InputMismatchException e){
           System.out.println(RED + "Something Went Wrong: Input Mismatched");
       }
    }

    public void display() {

        System.out.println("\n................................");
        for (Map.Entry<Integer, String> mc: sm.entrySet()){
            System.out.println(BLUE + mc.getKey() + mc.getValue());
        }
        System.out.println("................................\n");

    }
}
