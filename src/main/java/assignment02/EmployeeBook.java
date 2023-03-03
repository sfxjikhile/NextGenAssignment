package assignment02;

import java.util.Scanner;

// QUESTION 1
public class EmployeeBook {

    static Scanner sc = new Scanner(System.in);

    private void enterData(){
        System.out.println("");
        System.out.println("Type in your data here: ");
        String userInput = sc.next();
        System.out.printf("You entered %s. Your entry has been received.", userInput);
    }

    private void displayData(){
        String dataToDisplay = "Hey! Displaying this by default";
        System.out.println(dataToDisplay);
    }

    private static void exit(){
        System.out.println("Thank you for using 'Employee App'.\nGoodbye!");
    }

    public void start(){
        System.out.print("Welcome to the Employee App.\nTo enter data, press 1.\nTo display data, press 2.\nTo exit, press 3\n>>");
        int userChoice = sc.nextInt();

        switch(userChoice){
            case 1:
                this.enterData();
                return;
            case 2:
                this.displayData();
                return;
            case 3:
                this.exit();
                return;
            default:
                System.out.printf("%s is an invalid entry", userChoice);
        }
    }

    public static void main(String[] args){
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.start();
    }
}

