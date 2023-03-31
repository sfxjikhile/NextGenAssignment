package assignment04_week7;

import java.util.ArrayList;

public class Employee extends Person{
    double salary;
    String department;
    String designation;

    public Employee (String id, String firstname, String lastname, int age, double salary, String department, String designation){
        super(firstname, lastname, age, id);
        this.salary = salary;
        this.department = department;
        this.designation = designation;
    }

    public Employee(){}

    public Employee register(ArrayList<Employee> employees){
        System.out.println("Welcome to LearnMore University!\nPlease enter your details below");
        System.out.print("Enter your ID: ");
        String id = validateEmployeeID(sc.next(), employees);

        System.out.print("Enter your firstname: ");
        String firstName = sc.next();

        System.out.print("Enter your lastname: ");
        String lastName = sc.next();

        System.out.print("Enter your age: ");
        int age = validateAge(sc.next());

        System.out.print("Enter your salary: ");
        double salary = validateDouble(sc.next());

        System.out.print("Enter your department: ");
        String department = sc.next();

        System.out.print("Enter your designation: ");
        String designation = sc.next();

        System.out.println("Your details have been saved.\nThanks for registering");
        return new Employee(id, firstName, lastName, age, salary, department, designation);
    }

    protected String validateEmployeeID(String id, ArrayList<Employee> employees){
        for(Employee employee: employees){
            if(employee.getId().equalsIgnoreCase(id)){
                System.out.println("ID already exists.\nPlease enter another value");
                id = sc.next();
                validateEmployeeID(id, employees);
            }
        }
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
