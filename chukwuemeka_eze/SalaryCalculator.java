import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basicSalary = input.nextDouble();

        double hra = 0.5 * basicSalary;
        double specialAllowance = 0.75 * basicSalary;
        double pfDeduction = 0.12 * basicSalary;

        double totalSalary = basicSalary + hra + specialAllowance;
        double netPayableSalary = totalSalary - pfDeduction;

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Net Payable Salary: " + netPayableSalary);

        input.close();
    }
}
