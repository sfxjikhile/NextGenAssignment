package com.assignment.solutions.assignment12.number1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Domain {
    Scanner sc = new Scanner(System.in);

    public void domainName(){
        System.out.println("Enter The Web Portal Name");
        String domainName = sc.next();
        txtRegex(domainName);

        System.out.println("\nInput Entered Successful.....");

    }

    public void txtRegex(String domainName) {
        Pattern pattern = Pattern.compile("(http|https)://((\\w+.\\w+))");
        Matcher mat = pattern.matcher(domainName);
        boolean found = mat.matches();
        if (!found) {
            System.out.println("\nYour input should have a format of https://chuks.com : Try again.. ");
            System.out.print(">>");
            String txt = sc.next();
            txtRegex(txt);
        }


    }


    public static void main(String[] args) {
        Domain dm = new Domain();
        dm.domainName();
    }

}

