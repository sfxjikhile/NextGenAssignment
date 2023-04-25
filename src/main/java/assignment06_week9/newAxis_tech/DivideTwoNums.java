package assignment06_week9.newAxis_tech;

import java.util.Scanner;

public class DivideTwoNums {
    static Scanner sc = new Scanner(System.in);

    /*public static <T extends Number, V extends Number> void divideTwoNums(T num1, V num2){
        try{
            if(!(num1 instanceof Number) || !(num2 instanceof Number)){
                throw new MyInvalidTypeException("Type mismatch occurred. "+ num1 + " and " + num2 + "must be Numbers");
            }

            if(num2.intValue() == 0){
                throw new IllegalArgumentException("Division by 0 not permitted. The second argument must not be 0");
            }
            System.out.println(num1.doubleValue()/num2.doubleValue());
        }catch (MyInvalidTypeException | IllegalStateException exc){
            System.out.println(exc.toString());
            return;
        }
    }*/

    public static <T extends Number, V extends Number> void num1ByNum2(T num1, V num2){
        try{
            if(!(num1 instanceof Number) || !(num2 instanceof Number)){
                throw new InvalidDivisionArgumentException();
            }
            if(num2.doubleValue() == 0){
                throw new DivisionByZeroException();
            }
            System.out.println(num1.doubleValue()/num2.doubleValue());
        }catch(DivisionByZeroException | InvalidDivisionArgumentException exc){
            System.out.println(exc.toString());
        }
    }

    public static void main(String[] args){
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        num1ByNum2(num1, num2);
    }
}
