package week12_assignment9.flexi;

public class Salary implements SalaryI{
    private String firstName;
    private String lastName;
    private String department;

    public Salary(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }
}
