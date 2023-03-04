package assignment2;

import java.util.Scanner;

public class EmployeeBook {

    void enterData() {
        System.out.println("Enter your data");
    }

    void displayData() {
        System.out.println("Data displayed ...");
    }

    void exitMenu() {
        System.out.println("Program exited ...");
    }

    public static void main(String[] args) {
        System.out.println("1: Enter Data" + "\n" + "2: Display Data" + "\n" + "3: Exit");
        Scanner option = new Scanner(System.in);
        System.out.println();
        System.out.println("Select an Option");
        int num = option.nextInt();
        EmployeeBook receive = new EmployeeBook();

        System.out.println();

       if (num == 1) {
            receive.enterData();
                }
        if (num == 2) {
            receive.displayData();
            }
        if (num == 3){
            receive.exitMenu();

    }
      }
        }