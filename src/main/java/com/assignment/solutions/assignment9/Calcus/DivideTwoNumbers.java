package com.assignment.solutions.assignment9.Calcus;

public class DivideTwoNumbers {
    public void divideNumbers(int firstNum, int secondNum) {
        try{
            System.out.println(firstNum + " / " + secondNum + " = " + firstNum / secondNum);
        }catch(ArithmeticException e){
            System.out.println("SOMETHING WENT WRONG:\n" + firstNum + " CANT BE DIVIDE BY ZERO(0)...... ");
        }
    }

    public static void main(String[] args) {
        DivideTwoNumbers dtn = new DivideTwoNumbers();
        dtn.divideNumbers(1000,7);
    }
}