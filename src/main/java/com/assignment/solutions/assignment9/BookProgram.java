package com.assignment.solutions.assignment9;

import java.io.*;
import java.util.*;

public class BookProgram {
    private static final String FILENAME = "book_details.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Input book details");
            System.out.println("2. Display book details");
            System.out.println("3. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    inputBookDetails();
                    break;
                case 2:
                    displayBookDetails();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }

    private static void inputBookDetails() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
            scanner.nextLine(); // consume the newline character

            System.out.println("Enter book name:");
            String bookName = scanner.nextLine();

            System.out.println("Enter author name:");
            String authorName = scanner.nextLine();

            System.out.println("Enter price:");
            double price = scanner.nextDouble();

            writer.write(bookName + "," + authorName + "," + price);
            writer.newLine();
            System.out.println("Book details saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }

    private static void displayBookDetails() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                String bookName = details[0];
                String authorName = details[1];
                double price = Double.parseDouble(details[2]);
                System.out.println("Book name: " + bookName);
                System.out.println("Author name: " + authorName);
                System.out.println("Price: " + price);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }
    }
}
