package com.assignment.solutions.assignment7.assignment7b;

public class FixedAccount {

    public void  calculateInterest() {
        double principal, rate, time, interest, divide;

        divide = 100;
       principal = 100_406.00;
       rate = 0.15;
       time = 2.0;
       interest = principal * rate * time / divide;
        System.out.println("the interest on the fixed account " +
                "for the period of two years is: " + interest);
    }
}
