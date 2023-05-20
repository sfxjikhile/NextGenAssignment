package week12_assignment9.flexi;

public class ProcessDetails <T extends Salary> {
    public void printSalaryDetails(T ob){
        System.out.println("First name: " + ob.getFirstName());
        System.out.println("Last name: " + ob.getLastName());
        System.out.println("Department: " + ob.getDepartment());
        System.out.println("Salary due: " + ob.calculateSalary());
    }
}
