package com.assignment.solutions.assignment7.assignment7b;

public class SavingsAccount extends FixedAccount {
    @Override
    public void calculateInterest() {
        double principal, rate, time, interest, divide, now;

        divide = 100;
        principal = 70_578.00;
        rate = 0.12;
        time = 2.0;
        interest = principal * rate * time / divide;
        System.out.println("the interest on the savings account " +
                "for the period of two years is: " + interest);
    }


    public static void main(String[] args) {
        FixedAccount acc = new FixedAccount();
        acc.calculateInterest();
        SavingsAccount save = new SavingsAccount();
        save.calculateInterest();


    }
}
//SavingsAccount save1 = new SavingsAccount();
//SavingsAccount save2 = new SavingsAccount();
//save1.principal = 70_000.00;
//save1.rate = 0.15;
//save1.time = 2.0;
//save1.divide = 100;
//save1.interest = save1.principal * save1.rate * save1.time / save1.divide;
//
//save2.principal = 100_000.00;
//save2.rate =
//            System.out.println(save1.interest);
  //  }
//}
