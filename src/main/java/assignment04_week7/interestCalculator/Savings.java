package assignment04_week7.interestCalculator;

public class Savings extends FixedDeposit{
    @Override
    protected void calculateInterest(){

        System.out.println("Enter the following details below to estimate the interest on your savings account");

        System.out.print("Enter your current balance: ");
        principal = validateDouble(sc.next());

        System.out.print("Enter the investment duration: ");
        duration = validateDouble(sc.next());

        System.out.print("Enter interest rate in percent: ");
        interestRate = validateDouble(sc.next())/100.0;

        double newAmount = principal * (1 + duration * interestRate);

        double interest = newAmount - principal;
        System.out.printf("Your amount will be: %.2f by the end of the investment duration\n", newAmount);
        System.out.printf("Interest accrued will be: %.2f\n", interest);
    }
}
