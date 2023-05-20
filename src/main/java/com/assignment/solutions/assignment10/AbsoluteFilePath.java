package com.assignment.solutions.assignment10;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbsoluteFilePath {

    Scanner sc = new Scanner(System.in);

    public void absoluteFile(){
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The Absolute File path Below:");
        System.out.print(">>");
        String file = sc.next();
        txtRegex(file);


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Enter text");

            do{
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("end") == 0) break;
                str += "\r\n";
                bw.write(str);
            }while(str.compareTo("end") != 0);

        }catch (IOException e) {
            System.out.println(e);
        }
    }


    public void txtRegex(String text) {
        Pattern pattern = Pattern.compile("([A-Z]:)?(\\\\[a-zA-Z0-9_.-]+)+\\\\(\\w+\\.txt)");
        Matcher mat = pattern.matcher(text);
        boolean found = mat.matches();
        if (!found) {
            System.out.println("Your input should have a format of C:\\Users\\SPEED\\Desktop\\file.txt : Try again.. ");
            System.out.print(">>");
            String txt = sc.next();
            txtRegex(txt);
        }
    }


    public static void main(String[] args) {
        AbsoluteFilePath aF = new AbsoluteFilePath();
        aF.absoluteFile();
    }

}

