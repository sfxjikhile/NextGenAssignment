package com.assignment.solutions.assignment9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            System.out.println("Enter the content to write into the file: ");
            String line;
            while (!(line = scanner.nextLine()).equals("end")) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Content has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
