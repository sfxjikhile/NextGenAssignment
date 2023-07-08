import java.util.Scanner;

public class Employee extends LearnMore {
    double salary;
    String department;
    String designation;
    String employeeId;

    public void employeeDetails() {
        super.details();
        Scanner id = new Scanner(System.in);
        System.out.print("Your salary: ");
        salary = id.nextDouble();
        System.out.print("department: ");
        department = id.next();
        System.out.print("designation: ");
        designation = id.next();
        System.out.print("employee id: ");
        employeeId = id.next();
        System.out.println();
        showDetails();
    }

    public void showDetails() {
        System.out.println("These are your details");
        System.out.println("first name is: " + super.firstN);
        System.out.println("last name is: " + super.lastN);
        System.out.println("age is: " + super.age);
        System.out.println("your salary is: " + salary);
        System.out.println("your department is: " + department);
        System.out.println("your designation is: " + designation);
        System.out.println("your employee id is: " + employeeId);

    }


}

