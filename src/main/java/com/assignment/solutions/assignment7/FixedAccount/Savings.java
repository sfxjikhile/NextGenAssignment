package com.assignment.solutions.assignment7.FixedAccount;

public class Savings extends FixedAccount{

    @Override
    public double calculateInterest() {
        double interest ;

        int principle = 300;
        double  time = 5.4;
        double rating = 1.4;

        interest = principle * rating * time;

        return interest;
    }

}
