package chuks.assignment.FixedAccount;

public class Main {
    public static void main(String[] args) {
        FixedAccount fixedAccount = new FixedAccount();
        Savings savings = new Savings();
        System.out.println( "Interest Of Fixed Account = " + fixedAccount.calculateInterest());
        System.out.println("Interest Of Savings Account = " + savings.calculateInterest());

    }
}
