package assignment04_week7;

//import java.util.IllegalFormatConversionException;

public class SavingsAccount extends FixedDepositAccount{
    private static final double interestRate = 0.10;

    /*@Override
    protected void calculateInterest(){
        try{
            System.out.println("Welcome to Emmabest Bank");
            System.out.printf("We offer a %.2f percent interest rate per annum on savings deposit accounts\n", interestRate*100);
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
    }*/

    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.calculateInterest(interestRate, "Savings Account");
    }
}
