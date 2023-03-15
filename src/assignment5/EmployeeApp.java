package assignment5;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seamfix EmployeeApp!");

        while (true) {
            System.out.println("\nSelect menu");
            System.out.println("1. Enter employee data");
            System.out.println("2. View employee data");
            System.out.println("3. Quit App");
            System.out.print("Select option (1, 2, or 3): ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter employee ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter employee name: ");
                String name = input.nextLine();

                System.out.print("Enter employee department: ");
                String department = input.nextLine();

                System.out.print("Enter employee designation: ");
                String designation = input.nextLine();

                System.out.print("Enter date of joining (yyyy-mm-dd): ");
                LocalDate dateOfJoining = LocalDate.parse(input.nextLine());

                System.out.print("Enter date of birth (yyyy-mm-dd): ");
                LocalDate dateOfBirth = LocalDate.parse(input.nextLine());

                System.out.print("Are you married? (yes/no): ");
                String married = input.nextLine();

                LocalDate dateOfMarriage = null;

                if (married.equals("yes")) {
                    System.out.print("Enter date of marriage (yyyy-mm-dd): ");
                    dateOfMarriage = LocalDate.parse(input.nextLine());
                }

                System.out.println("\nSeamfix Employee details:");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Department: " + department);
                System.out.println("Designation: " + designation);
                System.out.println("Date of joining: " + dateOfJoining);
                System.out.println("Date of birth: " + dateOfBirth);

                if (married.equals("yes")) {
                    System.out.println("Marital status: Married");
                    System.out.println("Date of marriage: " + dateOfMarriage);
                } else {
                    System.out.println("Marital status: Single");
                }

            } if (choice == 2) {
                System.out.print("Enter employee ID: ");
                int id = input.nextInt();
                input.nextLine();

                if (id == 111) {
                    System.out.println("\nYour Employee details are:");
                    System.out.println("ID: " + id);
                    System.out.println("Name: Iman M");
                    System.out.println("Department: Cohort2");
                    System.out.println("Designation: Backend Student");
                    System.out.println("Date of joining: 2000-01-01");
                    System.out.println("Date of birth: 1960-10-01");
                    System.out.println("Marital status: Married");
                    System.out.println("Date of marriage: 2023-01-01");
                } else {
                    System.out.println("\nError: Employee with ID " + id + " not found.");
                }

            } else if (choice == 3) { System.out.println("Goodbye from Seamfix!" + "\n See you next time");
                break;

            } else {
                System.out.println("\nError: Invalid choice. Please enter 1, 2, or 3 only.");
            }
        }

        input.close();
    }
}





