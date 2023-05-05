package com.assignment.solutions.Assignment10;
/*You need to develop an application that accepts the name of a file and the word to be searched in that file.
        Based on the input that the user has provided, the application should display
        the number of occurrences of that word in the file.*/



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Occurrence {
    String line;
    String filename;
    String searchWord;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    public void occurrence() {
        System.out.print("Input the name of the file to read from: ");
        filename = sc.next();
        System.out.print("Input the word to search for: ");
        searchWord = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
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
        Occurrence occurred = new Occurrence();
        occurred.occurrence();
    }
}
