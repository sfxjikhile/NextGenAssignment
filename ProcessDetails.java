package com.nextgen.assignment12c;

import java.util.Scanner;

/* Flexi Inc. is a leading glass manufacturing organization in the US. The HR department of the organization found that
         its Employee Management system needs to be redeveloped. The HR department wants the system to maintain the
         information of both, the hourly paid employees and monthly paid employees,
         separately by using a single interface only. For this, it has assigned the task of developing an interactive system
     to Telltro, a software development organization. In the organization, Iman, the Senior Software Developer,
     has been assigned the responsibility to accomplish the development. For this, Iman has decided to create the
     following classes to develop the application.
     HourlySalary: Will contain the basic details of the employee and salary calculation functionality according to hours.
     MonthlySalary: Will contain the basic details of the employee and salary calculation functionality according
     to months.
     ProcessDetails: Will be a generic class that will accept an object of the HourlySalary or MonthlySalary class.
     In addition, it will process and print the details of both the classes.
     EmployeeManagement: Will provide the user interface that will allow a user to add and view the employee details.
     In addition, it will allow a user to enter the number of hours or months according to the type of employee.

     In the initial phase, Iman has decided to create the character user interface for the application.
     Help Iman to achieve the preceding requirements*/
public class ProcessDetails<T extends EmployeeManagement & EmployeeInfo> {
    T obj;

    public ProcessDetails(T obj) {
        this.obj = obj;
    }
    public void toPrint(){
        obj.employeeInfo();
        System.out.println();
    }
    public static void main(String[] args) {
        int select;
        Scanner sc = new Scanner(System.in);
        ProcessDetails<Monthly> processDetails = new ProcessDetails<>(new Monthly());
        ProcessDetails<Hourly> processDetails2 = new ProcessDetails<>(new Hourly());

        do {
            System.out.println("Welcome to Flexi inc\nPlease select an option...\n1: To enter details as a monthly staff\n" +
                    "2: To enter details as an hourly staff\n3: To exit");
            select = sc.nextInt();
            switch (select){
                case 1:
                    processDetails.toPrint();
                    break;
                case 2:
                    processDetails2.toPrint();
                    break;
                case 3:
                    System.out.println("Clocking out...\nThank you...");
                    break;
                default:
                    System.out.println( "invalid input");
            }

        }while (select != 3);
    }
}

