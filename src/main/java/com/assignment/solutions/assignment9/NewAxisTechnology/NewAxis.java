package com.assignment.solutions.assignment9.NewAxisTechnology;

import java.util.Scanner;

public class NewAxis implements UserInterface {
    private String name;
    private String contactDetails;
    private int age;

    private final int lowestAge = 20;
    private final int highestAge = 50;

    Scanner sc = new Scanner(System.in);

    public void userDetails(){
        System.out.println("WELCOME ENTER YOUR DETAILS BELOW>>>>\nEnter Name: ");
        name = sc.next();

        System.out.println("Enter Contact Details: ");
        contactDetails = sc.next();

        System.out.println("Enter Age: ");
        age = sc.nextInt();
        ageValidation(age);

        System.out.println("USER DETAILS SUCCESSFULLY UPLOADED....... ");

    }

    public void ageValidation(int aging){
        try {
            if (aging < lowestAge || aging > highestAge) {
                throw new LesserThanGreaterThanException("AGE SHOULDN'T BE BELOW 20 OR ABOVE 50 \nTry Again...");
            }
        }catch (LesserThanGreaterThanException e) {
            System.out.println(e);
            int newAge = sc.nextInt();
            ageValidation(newAge);
        }
    }

}
