package fittingCompany;

import fittingCompany.Furniture;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class FurnitureController extends Furniture implements FurnitureInterface {
    Scanner sc = new Scanner(System.in);
    public static final String RED= "\u001B[31m";
    public static final String BLUE= "\u001B[34m";
    public static final String RESET= "\u001B[0m";
    public static final String UNDERLINE= "\u001B[4m";

    int numberOfOrderedChair = 0;
    int numberOfOrderedBookShelves = 0;



    public void Specifications() {
            System.out.println(RESET + "WELCOME TOO FFC WE MANUFACTURE THE FOLLOWING: \n1. CHAIRS \n2. BOOKSHELVES");
            System.out.println("\nEnter Your Specification Name:");
            String specInput = sc.next().toUpperCase();


            switch (specInput) {
                case "CHAIRS" :
                    attributesForChairs();
                    ContinueOrExit();
                    break;
                case "BOOKSHELVES" :
                    attributesForBookShelves();
                    ContinueOrExit();
                    break;
                default:
                    System.out.println(RED + " Wrong input try again.....");

            }


    }


    public void attributesForChairs() {
        try{
            System.out.println("Enter chair price:");
            double price = sc.nextDouble();
            setPrice(price);

            System.out.println("Enter chair Quantity:");
            int number = sc.nextInt();
            setNumber(number);

            System.out.println("Enter chair width:");
            double width = sc.nextDouble();
            setWidth(width);

            System.out.println("Enter chair height:");
            double height = sc.nextDouble();
            setHeight(height);

            System.out.println("Enter chair Type:");
            String type = sc.next();
            setType(type);

            numberOfOrderedChair++;

            System.out.println("\nYour Order Has Been Taken.....");
            System.out.print("\nATTRIBUTES OF CHAIR ORDERED :\n");
            System.out.printf(BLUE + "Price : " + "$%,.2f\n", getPrice());
            System.out.println(BLUE + "Quantity : " + getNumber() +
                    "\nWidth : " + getWidth() + "cm" +
                    "\nHeight : " + getHeight() + "cm" +
                    "\nType : " + getType()
            );
        }catch(InputMismatchException e) {
            System.out.println( RED + "SOMETHING WENT WRONG: Input MisMatched Try Again");
        }

    }

    public void attributesForBookShelves() {
        try{
            System.out.println("Enter book shelve price:");
            double price = sc.nextDouble();
            setPrice(price);

            System.out.println("Enter book shelve quantity:");
            int number = sc.nextInt();
            setNumber(number);

            System.out.println("Enter book shelve width:");
            double width = sc.nextDouble();
            setWidth(width);

            System.out.println("Enter book shelve height:");
            double height = sc.nextDouble();
            setHeight(height);

            System.out.println("Enter book shelve Type:");
            String type = sc.next();
            setType(type);

            System.out.println("Enter book shelve space:");
            double space = sc.nextDouble();
            setSpaceBtw(space);
            numberOfOrderedBookShelves++;

            System.out.println("\nYour Order Has Been Taken.....");
            System.out.print("\nATTRIBUTES OF BOOK SHELVE ORDERED :\n");
            System.out.printf(BLUE + "Price : " + "$%,.2f\n", getPrice());
            System.out.println(BLUE + "Quantity : " + getNumber() +
                    "\nWidth : " + getWidth() + "cm" +
                    "\nHeight : " + getHeight() + "cm" +
                    "\nType : " + getType() +
                    "\nSpace Between : " + getSpaceBtw() + "cm"
            );

        }catch (InputMismatchException e) {
            System.out.println(RED + "SOMETHING WENT WRONG: Input MisMatched MisMatched Try Again");
        }

    }

    public  void ContinueOrExit() {
        System.out.print(RESET + "\nTo Take Another Order Enter 'continue' \nTo Leave This page Enter 'exit' \n >>");
        String input = sc.next().toLowerCase();
        if (input.equals("continue")) {
            System.out.println("\n\n..............................\n");
            Specifications();
        }else if (input.equals("exit")) {
            System.out.println("Exiting......\n");
            System.out.println(UNDERLINE + "Total Chair Ordered : " + numberOfOrderedChair +
                               "\nTotal Book Shelves Ordered : " + numberOfOrderedBookShelves +
                               "\nTotal Number OF Ordered Furniture : " + (numberOfOrderedBookShelves + numberOfOrderedChair));
            System.exit(0);
        }else {
            System.out.println(RED + "Wrong input.....");
        }
    }

}
