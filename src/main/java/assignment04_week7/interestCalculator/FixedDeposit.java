package assignment04_week7.interestCalculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixedDeposit {
    static Scanner sc = new Scanner(System.in);
    double principal;
    double interestRate;
    double duration;

    private double frequency = 12; // Frequency for compounding the savings (12 for monthly)
    double newAmount;

    protected void calculateInterest(){
        System.out.println("Enter the following details to estimate the interest on your fixed deposit account");

        System.out.print("Enter your current balance (Principal): ");
        principal = validateDouble(sc.next());

        System.out.print("Enter number of years (duration): ");
        duration = validateDouble(sc.next());

        System.out.print("Enter interest rate in percentage: ");
        interestRate = validateDouble(sc.next())/100.0;

        newAmount = principal * Math.pow((1 + (interestRate/frequency)), (duration * frequency));
        double interest = newAmount - principal;
        System.out.printf("Your amount will be: %.2f by the end of the investment duration\n", newAmount);
        System.out.printf("Interest accrued on your fixed deposit account will be: %.2f. This was compounded monthly\n", interest);

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
