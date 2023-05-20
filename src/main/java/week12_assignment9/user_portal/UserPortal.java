package week12_assignment9.user_portal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPortal {
    Scanner sc = new Scanner(System.in);
    List<User> users = new ArrayList<>();

    public void createUser(){
        System.out.println("Hello and Welcome");
        System.out.print("Enter your name here: ");
        String name = validateName(sc.next());

        System.out.print("Enter your phone number here(070-1234-5678): ");
        String phone = validatePhone(sc.next());

        users.add(new User(name, phone));
        System.out.println("Your details have been saved.\nGoodbye!!!");
    }

    protected String validateName(String input){
        Pattern namePattern = Pattern.compile("[a-zA-Z]{3,}");
        Matcher nameMatcher = namePattern.matcher(input);
        if(!nameMatcher.matches()){
            System.out.println(input + " is not a valid name\nExpecting at least 3 characters");
            System.out.print("Enter another name: ");
            validateName(sc.next());
        }

        return input;
    }

    protected String validatePhone(String input){
        Pattern phonePattern = Pattern.compile("0[789][01]-\\d{4}-\\d{4}");
        Matcher phoneMatcher = phonePattern.matcher(input);
        if(!phoneMatcher.matches()){
            System.out.println(input + " is not a valid phone number");
            System.out.println("Expecting this pattern: 0(7, 8, or 9)-0123-4567");
            System.out.print("Enter another phone number: ");
            validatePhone(sc.next());
        }

        return input;
    }

    public static void main(String[] args){
        new UserPortal().createUser();
    }
}
