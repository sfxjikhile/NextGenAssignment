package assignment04_week7.learnMore;

import java.util.ArrayList;

public class Employee extends Person{
    double salary;
    String department;
    String designation;

    String employeeID;

    public Employee (String employeeID, double salary, String department, String designation){
        super();
        this.salary = salary;
        this.department = department;
        this.designation = designation;
        this.employeeID = employeeID;
    }

    public static Employee register(ArrayList<Employee> employees){
        System.out.print("Enter your ID: ");
        String id = validateEmployeeID(sc.next(), employees);

        System.out.print("Enter your salary: ");
        double salary = validateDouble(sc.next());

        System.out.print("Enter your department: ");
        String department = sc.next();

        System.out.print("Enter your designation: ");
        String designation = sc.next();

        Employee newEmployee = new Employee(id, salary, department, designation);
        System.out.println("Your details have been saved.\nThanks for registering");
        return newEmployee;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    protected static String validateEmployeeID(String id, ArrayList<Employee> employees){
        for(Employee employee: employees){
            if(employee.getEmployeeID().equalsIgnoreCase(id)){
                System.out.println("ID already exists.\nPlease enter another value");
                id = sc.next();
                validateEmployeeID(id, employees);
            }
        }
        return id;
    }
}
