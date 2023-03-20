package assignment5;

import java.util.Scanner;


    public class EmployeeBook {
String employeeId;
String name;
String department;
String designation;
String dateOfJoining;
String maritalStatus;
String dateOfMarriage;

           void enterData() {
Scanner desk = new Scanner(System.in);
                        System.out.print("INPUT YOUR ID: ");
            employeeId = desk.nextLine();
               System.out.println(employeeId);
               System.out.println();
            System.out.print("FULL NAME: ");
            name = desk.nextLine().toUpperCase();
               System.out.println(name);
               System.out.println();
            System.out.print("DEPARTMENT: ");
            department = desk.nextLine().toUpperCase();
               System.out.println(department);
               System.out.println();
            System.out.print("DESIGNATION: ");
            designation = desk.nextLine().toUpperCase();
               System.out.println(designation);
               System.out.println();
            System.out.print("RESUMPTION DATE: ");
             dateOfJoining = desk.nextLine();
               System.out.println(dateOfJoining);
               System.out.println();
            System.out.print("MARITAL STATUS: ");
             maritalStatus = desk.nextLine().toUpperCase();
               System.out.println(maritalStatus);
               System.out.println();
if (maritalStatus.equals("MARRIED") ){
    System.out.print("DATE OF MARRIAGE: ");
    dateOfMarriage = desk.nextLine();
    System.out.println(dateOfMarriage);
    System.out.println("DONE...");
    System.out.println();
    System.out.println("1: Enter Data" + "\n" + "2: Display Data" + "\n" + "3: Exit");
    System.out.print("Select an option: ");
}
else{
    System.out.println("DONE...");
    System.out.println();
    System.out.println("1: Enter Data" + "\n" + "2: Display Data" + "\n" + "3: Exit");
    System.out.print("Select an option: ");
    return;
}
        }
        void displayData() {
             Scanner data = new Scanner(System.in);
            System.out.println("INPUT YOUR ID");
            String id = data.nextLine();
        EmployeeBook entry = new EmployeeBook();
        if (id.equals(this.employeeId) ){
            System.out.println();
            System.out.print( "Employee Name: " + name);
            System.out.println();
            System.out.print("Employee Department: " + department);
            System.out.println();
            System.out.print("Employee Designation: " + designation);
            System.out.println();
            System.out.print("Date Of Joining: " + dateOfJoining);
            System.out.println();
            System.out.println("Marital Status: " + maritalStatus);
            if (maritalStatus.equals("MARRIED")){

                System.out.println("Date Of Marriage: " + dateOfMarriage);
        }

        }
        else {
            System.out.println("invalid input");
        }
            System.out.println("End Line...");
            System.out.println();
            System.out.println("1: Enter Data" + "\n" + "2: Display Data" + "\n" + "3: Exit");
            System.out.print("Select an option: ");

        }
        void exitMenu(){
            System.out.println("Logging out...");
        }
        public static void main(String[] args) {

           EmployeeBook receive = new EmployeeBook();
            System.out.println("1: Enter Data" + "\n" + "2: Display Data" + "\n" + "3: Exit");
            System.out.print("Select an option: ");
            int num = 0;
            Scanner n = new Scanner(System.in);
            while (num != 3){
             num = n.nextInt();
                     if(num == 1){
                         receive.enterData();
                     }
                      else if (num == 2){
                         receive.displayData();
                     }
                     else if (num == 3){
                         receive.exitMenu();
                     }
                       else {
                          System.out.println("command not recognized");
                         System.out.println();

                       }
                 }

                     }
                 }

