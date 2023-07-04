package week7;

public class Account {
    private double balance; // Account balance

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to calculate interest
    public double calculateInterest() {
        // Interest calculation logic for fixed account
        // You can modify this logic to suit your requirements
        double interestRate = 0.05; // Fixed account interest rate
        return balance * interestRate;
    }

    // SavingsAccount class that extends Account class
    public static class SavingsAccount extends Account {
        // Constructor
        public SavingsAccount(double balance) {
            super(balance);
        }

        // Override calculateInterest() method for savings account
        @Override
        public double calculateInterest() {
            // Interest calculation logic for savings account
            // You can modify this logic to suit your requirements
            double interestRate = 0.03; // Savings account interest rate
            return getBalance() * interestRate;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create instances of Account and SavingsAccount
        Account fixedAccount = new Account(5000.0);
        SavingsAccount savingsAccount = new SavingsAccount(5000.0);

        // Calculate interest for fixed account and display result
        double fixedInterest = fixedAccount.calculateInterest();
        System.out.println("Interest for Fixed Account: " + fixedInterest);

        // Calculate interest for savings account and display result
        double savingsInterest = savingsAccount.calculateInterest();
        System.out.println("Interest for Savings Account: " + savingsInterest);
    }
}
