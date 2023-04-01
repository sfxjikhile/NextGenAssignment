package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class LearnMore {
    public void details() {

        System.out.println("Imput your details as follows ".toUpperCase());
        Scanner id = new Scanner(System.in);
        System.out.print("First name: ");
        String firstN = id.nextLine();
        System.out.print("Last name: ");
        String LastN = id.nextLine();

        while (true){
            System.out.println("input your age in numbers (i.e 12,13,14...)".toUpperCase());
            System.out.print("Your age: ");
           String ageL = id.next();
            System.out.println();
            int age = 0;
           try {
                age = Integer.parseInt(ageL);
             //  System.out.println("correct input".toUpperCase());
               break;
            } catch (NumberFormatException epp) {
               // System.out.println("input your age in numbers (i.e 12,13,14...)".toUpperCase());
            }

        }


    }

}
