package com.assignments.questions;

import java.util.Scanner;

public class DisplayMenu {
    String response = "";

    String enterData() {
        response = "Enter Data";
        return response;
    }

    String displayData() {
        response = "Display Data";
        return response;
    }

    String exitMenu() {
        response = "Exit";
        return response;
    }


    public static void main(String [] args){
        DisplayMenu displayMenu = new DisplayMenu();

        // Displayed Menu
        System.out.println("1. Enter Data \n2. Display Data \n3. Exit\n");

        Scanner sc = new Scanner(System.in);


        System.out.println("Input Menu Option:");

        // User input
        int userInput = sc.nextInt();

        switch(userInput) {
            case 1:
                System.out.println(displayMenu.enterData());
                break;
            case 2:
                System.out.println(displayMenu.displayData());
                break;
            case 3:
                System.out.println(displayMenu.exitMenu());
                break;
            default:
        }
    }

}

