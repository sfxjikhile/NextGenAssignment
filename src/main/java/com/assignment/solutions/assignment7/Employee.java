package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class Employee extends LearnMore{

 public void employeeId(){
     Scanner id = new Scanner(System.in);
     System.out.print("Your salary: ");
    String salary = id.nextLine();
     System.out.print("department: ");
            String departmentN = id.nextLine();
     System.out.print("designation: ");
            String designation = id.nextLine();
     System.out.print("employee id: ");
        String employeeId = id.nextLine();
     System.out.println();
     System.out.println(("your information has been stored successfully\n" +
             "kindly press 3 to exit the application").toUpperCase());
     System.out.println();

 }


}
