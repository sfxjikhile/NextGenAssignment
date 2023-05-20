package com.assignment.solutions.assignment10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searched {

    Scanner sc = new Scanner(System.in);

    public void inputNameAndFile() {
        System.out.println("...................WELCOME...................\n" +
                            "Below Enter Name Of File and Word to search\n.............................................");

        System.out.println("\nInput Name of FIle:");
        System.out.print(">>");
        String nameOfFile = sc.next();
        txtRegex(nameOfFile);

        System.out.println("\nInput The Word To Be Searched:");
        System.out.print(">>");
        String word = sc.next();

        int occur = numberOfOccurrences(nameOfFile, word);

        System.out.println("\nThe Word " + word + " Occurred : " + occur);

    }


    public int numberOfOccurrences(String name, String inputSearch) {
        String str;
        int wordCount = 0;

        try {
            try(BufferedReader bf = new BufferedReader(new FileReader(name)) ){
                while ((str = bf.readLine()) != null) {
                    wordCount += searcherRegex(inputSearch, str);
                }

            }catch (FileNotFoundException e){
                System.out.println("\nERROR : File Do Not Exist Reload and try again");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }


    public void txtRegex(String text) {
        Pattern pattern = Pattern.compile("(\\w+\\.txt)");
        Matcher mat = pattern.matcher(text);
        boolean found = mat.matches();
        if (!found) {
            System.out.println("Your input should have a format of file.txt : Try again.. ");
            System.out.print(">>");
            String txt = sc.next();
            txtRegex(txt);
        }

    }


    public int searcherRegex(String search, String s) {
        int count = 0;

        Pattern pattern = Pattern.compile("\\b" + search + "(?!\\w)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find())
            count++;

        return count;
    }


    public static void main(String[] args) {
        Searched sc = new Searched();
        sc.inputNameAndFile();
    }
}
