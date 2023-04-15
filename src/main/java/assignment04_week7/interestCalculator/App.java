package assignment04_week7.interestCalculator;

import assignment04_week7.learnMore.Student;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int userChoice;

        System.out.println("Welcome to Emmy's Interest Calculation Service");

        do{
            System.out.println("To calculate interest for Savings account, enter 1 \n" +
                    "To calculate interest for Fixed Deposit account, enter 2 \n" +
                    "To exit, enter 3");
            System.out.print(">>");
            userChoice = validateChoice(sc.next());

            switch (userChoice){
                case 1:
                    new Savings().calculateInterest();
                    break;
                case 2:
                    new FixedDeposit().calculateInterest();
                    break;
                case 3:
                    System.exit(0);
            }
        }while(userChoice != 3);
    }

    public static int validateChoice(String userInput){
        Pattern inputRegex = Pattern.compile("[123]");
        Matcher inputMatcher = inputRegex.matcher(userInput);
        if(!inputMatcher.matches()){
            System.out.println("Invalid entry, expecting 1, 2 or 3");
            userInput = sc.next();
            validateChoice(userInput);
        }
        return Integer.parseInt(userInput);
    }
}
