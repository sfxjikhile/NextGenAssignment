package week12_assignment9.flexi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeManager {
    Scanner sc = new Scanner(System.in);
    List<HourlySalary> hourlyEmployees = new ArrayList<>();
    List<MonthlySalary> monthlyEmployees = new ArrayList<>();

    public void createEmployee(){
        System.out.print("Enter employee type (Monthly or Hourly): ");
        SalaryType salaryType = validateSalaryType(sc.next());

        System.out.print("Enter your first name: ");
        String firstName = sc.next();

        System.out.print("Enter your last name: ");
        String lastName = sc.next();

        System.out.print("Enter your department: ");
        String department = sc.next();

        if(salaryType.equals(SalaryType.HOURLY)){
            System.out.print("Enter the number of hours worked: ");
            double hoursWorked = validateDouble(sc.next());

            System.out.print("Enter the hourly rate: ");
            double hourlyRate = validateDouble(sc.next());

            hourlyEmployees.add(new HourlySalary(firstName, lastName, department, hoursWorked, hourlyRate));

        }else{
            System.out.print("Enter monthly salary: ");
            double monthlySalary = validateDouble(sc.next());

            monthlyEmployees.add(new MonthlySalary(firstName, lastName, department, monthlySalary));
        }
        System.out.println("Your details have been successfully saved");
    }

    public void getDetails(){
        System.out.print("Enter employee type (Monthly or Hourly): ");
        SalaryType salaryType = validateSalaryType(sc.next());

        System.out.print("Enter index: ");
        int arrayIndex = validateIndex(salaryType, sc.next());

        if(salaryType.equals(SalaryType.HOURLY)){
            //new HourlySalary().getDetails(hourlyEmployees.get(arrayIndex));
            ProcessDetails<HourlySalary> hourlyGen = new ProcessDetails<>();
            hourlyGen.printSalaryDetails(hourlyEmployees.get(arrayIndex));
            //new ProcessDetails<>().printSalaryDetails(hourlyEmployees.get(arrayIndex));
        }else{
            //new MonthlySalary().getDetails(monthlyEmployees.get(arrayIndex));
            ProcessDetails<MonthlySalary> monthlyGen = new ProcessDetails<>();
            monthlyGen.printSalaryDetails(monthlyEmployees.get(arrayIndex));
            //new ProcessDetails<>().printSalaryDetails(monthlyEmployees.get(arrayIndex));
        }
        System.out.println();
    }

    public void run(){
        System.out.println("To create record, enter 1.\nTo display record, enter 2.\nTo exit, enter 3");
        String choice = sc.next();

        switch (choice){
            case "1":
                createEmployee();
                run();
            case "2":
                getDetails();
                run();
            case "3":
                System.out.println("Goodbye!!!");
                System.exit(0);
            default:
                run();
        }
    }

    public static void main(String[] args){
        new EmployeeManager().run();
    }

    private SalaryType validateSalaryType(String input){
        if(input.equalsIgnoreCase("hourly")){
            return SalaryType.HOURLY;
        }else if(input.equalsIgnoreCase("monthly")){
            return SalaryType.MONTHLY;
        }else{
            System.out.println("Invalid salary type.\nExpecting hourly or monthly");
            System.out.print("Enter a valid type: ");
            return validateSalaryType(sc.next());
        }
    }

    private double validateDouble(String input){
        Pattern doublePattern = Pattern.compile("(\\d)*(.)?(\\d)*");
        Matcher doubleMatcher = doublePattern.matcher(input);
        if(!doubleMatcher.matches()){
            System.out.println(input + " is not a valid entry. Expecting a whole number or a decimal");
            System.out.print("Enter another value: ");
            validateDouble(sc.next());
        }

        return Double.parseDouble(input);
    }

    private int validateIndex(SalaryType salaryType, String input){

        try{
            int index = Integer.parseInt(input);

            if(salaryType.equals(SalaryType.HOURLY)){
                if(!(hourlyEmployees.size() > index)){
                    System.out.println("Index out of bound");
                    System.out.print("Enter a smaller index: ");
                    return validateIndex(salaryType, sc.next());
                }
                return index;
            }else{
                if(!(monthlyEmployees.size() > index)){
                    System.out.println("Index out of bound");
                    System.out.print("Enter a smaller index: ");
                    return validateIndex(salaryType, sc.next());
                }
                return index;
            }
        } catch (NumberFormatException exc){
            System.out.println("Invalid index entered");
            System.out.print("Enter an integer");
            return validateIndex(salaryType, sc.next());
        }
    }
}
