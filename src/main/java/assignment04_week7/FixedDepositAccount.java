package assignment04_week7;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixedDepositAccount {
    Scanner sc = new Scanner(System.in);
    private static final double interestRate = 0.15;

    protected void calculateInterest(double interestRate, String accountType){
        try{
            System.out.println("Welcome to Emmabest Bank");
            System.out.printf("We offer a %.2f percent interest rate per annum on %s accounts\n", interestRate*100, accountType);
            System.out.println("Enter your details below to calculate accruable interest");

            System.out.print("Enter your current balance: ");
            double currentBalance = validateDouble(sc.next());

            System.out.print("Enter the fixed deposit duration: ");
            int numOfYears = validateInt(sc.next());

            double interest = interestRate * numOfYears * currentBalance;
            System.out.printf("Your accruable interest is: %.2f", interest);
        }catch(IllegalFormatConversionException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.calculateInterest(interestRate, "Fixed Deposit Account");
    }

    protected double validateDouble(String inputString){
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

    protected int validateInt(String inputString){
        Pattern intRegex = Pattern.compile("[0-9]+");
        Matcher intMatcher = intRegex.matcher(inputString);
        if(!intMatcher.matches()){
            System.out.print("Invalid number provided.\nPlease enter a valid number: ");
            String newInput = sc.next();
            return validateInt(newInput);
        }else{
            return Integer.parseInt(inputString);
        }
    }
}
