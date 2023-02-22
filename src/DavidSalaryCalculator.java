import java.util.Scanner;
public class DavidSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextInt();
        double hra = 0.5 * basicSalary;
        double specialAllowance = 0.75 * basicSalary;
        double pf = 0.12 * basicSalary;
        double totalSalary = (basicSalary + hra + specialAllowance);
        double netPayableSalary = totalSalary - pf;
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Net Payable Salary: " + netPayableSalary);
        scanner.close();
    }
}

