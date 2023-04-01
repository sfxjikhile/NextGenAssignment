package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class Students extends LearnMore{

   public void studentD() {
       Scanner id = new Scanner(System.in);
        System.out.print("preferred course: ");
        String course = id.nextLine();
        System.out.print("Student identification number: ");
        String studId = id.nextLine();
       System.out.println();
       System.out.println(("your information has been stored successfully" +
               "\nkindly press 3 to exit the application").toUpperCase());
       System.out.println();
    }

    }

