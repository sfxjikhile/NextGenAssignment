package com.assignment.solutions.assignment12.number2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameContactNumber {
    Scanner sc = new Scanner(System.in);
    public void NameAndNumber(){
        System.out.println("Enter Name");
        String name = sc.next();
        txtRegex(name);

        System.out.println("Enter Contact Number");
        String contactNumber = sc.next();
        numberRegex(contactNumber);
        System.out.println("\nInput Entered Successful.....");

    }

    public void txtRegex(String name) {
        Pattern pattern = Pattern.compile("[a-z A-Z]+");
        Matcher mat = pattern.matcher(name);
        boolean found = mat.matches();
        if (!found) {
            System.out.println("\nYour input most have an alphabetic format  : Try again.. ");
            System.out.print(">>");
            String txt = sc.next();
            txtRegex(txt);
        }
    }
//(http|https)://((\w+.\w+))
    public void numberRegex(String contactNum) {
        Pattern pattern = Pattern.compile("(\\d{3})-(\\d{4})-(\\d{4})");
        Matcher mat = pattern.matcher(contactNum);
        boolean found = mat.matches();
        if (!found) {
            System.out.println("\nYour input most have a numerical format of 000-0000-0000  : Try again.. ");
            System.out.print(">>");
            String num = sc.next();
            numberRegex(num);
        }
    }


    public static void main(String[] args) {
        NameContactNumber nc = new NameContactNumber();
        nc.NameAndNumber();
    }

}
