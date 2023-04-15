package assignment04_week7.learnMore;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args){
        int userChoice;

        System.out.println("Welcome to LearnMore University!");

        do{
            System.out.println("To register as a student, press 1\nTo register as employee, press 2\nTo terminate, press 3");
            System.out.print(">>");
            userChoice = validateChoice(sc.next());

            switch (userChoice){
                case 1:
                    students.add(Student.register(students));
                    break;
                case 2:
                    employees.add(Employee.register(employees));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid selection");
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
