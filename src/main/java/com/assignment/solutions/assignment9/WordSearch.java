package com.assignment.solutions.assignment9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the word to search: ");
        String word = scanner.nextLine();

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String w : words) {
                    if (w.equals(word)) {
                        count++;
                    }
                }
            }

            System.out.println("The word '" + word + "' appears " + count + " times in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
