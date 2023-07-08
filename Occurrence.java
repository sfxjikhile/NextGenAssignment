package com.nextgen.assignment10b;
import java.io.*;
import java.util.Scanner;

public class Occurrence {
    String line;

    int count = 0;


    public void occurrence(String filename, String searchWord) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    System.out.println(word);
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word \"" + searchWord + "\" occurs " + count + " times in the file.");
        } catch (IOException exp) {
            System.out.println("Error occurred " + exp);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name of the file to read from: ");
        String filename = sc.next();
        System.out.print("Input the word to search for: ");
        String searchWord = sc.next();

        Occurrence occurred = new Occurrence();
        occurred.occurrence(filename, searchWord);
    }
}