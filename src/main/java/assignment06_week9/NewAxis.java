package assignment06_week9;

import assignment06_week9.newAxis_tech.InvalidAgeException;
import assignment06_week9.newAxis_tech.UserDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAxis {
    Scanner sc = new Scanner(System.in);

    public void getUserDetails(){
        System.out.println("Enter your details below");
        String name = sc.next();

        System.out.println("Enter contact");
        String contact = sc.next();

        System.out.println("Enter age");
        int age = validateAge(sc.nextInt());
    }

    private int validateAge(int userInput){
        try{
            if(userInput < 20 || userInput > 55){
                throw new InvalidAgeException();
            }else{
                return userInput;
            }
        }catch(InvalidAgeException exc){
            System.out.println(exc);
            System.out.println("Age must be between 20 and 55");
            return validateAge(sc.nextInt());
        }
    }

    public static void main(String[] args){
        NewAxis na = new NewAxis();
        na.getUserDetails();
    }

}
