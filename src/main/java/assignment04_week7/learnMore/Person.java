package assignment04_week7.learnMore;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    static Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;

    public Person(){
        System.out.print("Enter your firstname: ");
        firstName = sc.next();

        System.out.print("Enter your lastname: ");
        lastName = sc.next();

        System.out.print("Enter your age: ");
        age = validateInt(sc.next());
    }


    protected static int validateInt(String userInput){
        Pattern ageRegex = Pattern.compile("\\d+");
        Matcher ageMatcher = ageRegex.matcher(userInput);
        if(!ageMatcher.matches()){
            System.out.println("Invalid age entered.");
            System.out.println("Please try again! Expecting an integer");
            userInput = sc.next();
            validateInt(userInput);
        }
        return Integer.parseInt(userInput);
    }

    protected static double validateDouble(String inputString){
        Pattern doubleRegex = Pattern.compile("([.]?[0-9]+)|([0-9]*[.][0-9]*)");
        Matcher doubleMatcher = doubleRegex.matcher(inputString);
        if(!doubleMatcher.matches()){
            System.out.print("Invalid number provided.\nPlease enter a valid number: ");
            String newInput = sc.next();
            return validateDouble(newInput);
        }else{
            return Double.parseDouble(inputString);
        }
    }
}
