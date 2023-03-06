public class Question1 { // This is the class containing the whole program
        public static void main(String[] args)
        { // This is the method that contain the actual functions being carried out
            Scanner scanner = new Scanner(System.in);

// This is the part that asks the user the question, receives the input and stores it in the variable
            System.out.print("Enter basic salary:");
            double basicSalary = scanner.nextDouble();

            double hra = 0.5 * basicSalary; // HRA Calculation
            double specialAllowance = 0.75 * basicSalary; // SpecialAllowance calculation
            double pf = 0.12 * basicSalary; // pf calculation

            double totalSalary = basicSalary + hra + specialAllowance; // Total Salary Calculation
            double netPayableSalary = totalSalary - pf; // Net Payable Salary Calculation

            // This handles the output
            System.out.println("The HRA: " + hra);
            System.out.println("Special Allowance:" + pf);
            System.out.println("The PF Deduction:" + pf);
            System.out.println("The Total Salary:" + totalSalary);
            System.out.println("The net Payable Salary:" + netPayableSalary);}
}

/*
We first import the Scanner class to read user input from the console. Then, we prompt the user to enter the basic salary and store the input in the basicSalary variable.
Next, we calculate the HRA, special allowance, and PF eduction based on the given formulae. We then calculate the total salary by adding the basic salary, HRA, and special allowance.
Finally, we calculate the net payable salary by subtracting the PF deduction from the total salary. We then display all the salary components, including the net payable salary, on the console using the System.out.printIn() method.
 */