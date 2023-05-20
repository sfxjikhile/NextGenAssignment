package week12_assignment9.flexi;

public class MonthlySalary extends Salary{
    private double salary;

    public MonthlySalary(String firstName, String lastName, String department, double monthlySalary) {
        super(firstName, lastName, department);
        this.salary = monthlySalary;
    }

    public double calculateSalary(){
        return this.salary;
    }
}
