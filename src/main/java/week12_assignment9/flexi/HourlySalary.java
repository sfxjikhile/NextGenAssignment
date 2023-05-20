package week12_assignment9.flexi;

public class HourlySalary extends Salary{
    private double hoursWorked;
    private double hourlyRate;

    public HourlySalary(String firstName, String lastName, String department, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
}
