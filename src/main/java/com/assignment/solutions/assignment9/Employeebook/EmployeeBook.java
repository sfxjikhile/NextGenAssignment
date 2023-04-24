package com.assignment.solutions.assignment9.Employeebook;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeBook implements EmployeeInterface {
    private String iD;
    private String name;
    private String department;
    private String designation;
    private Date dateOfJoining;
    private Date dateOfBirth;
    private String maritalStatus;
    private Date dateOfMarriage;


    Scanner sc = new Scanner(System.in);

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm-dd-yyyy");

    List<String> arr = new ArrayList<>();

   public void displayMenu() {
        try{
            while(true) {
                System.out.println("1. Enter Data \n2. Display Data \n3. Exit\n Input Menu Option: ");
                int inputNum = sc.nextInt();

                switch (inputNum) {
                    case 1 : userInputOne();
                        break;
                    case 2 : userInputTwo();
                        break;
                    case 3 : userInputThree();
                        break;
                    default:
                        throw new Employeeexception("INPUT SHOULD NOT BE LESS THAN 1 OR GREATER THAN 3");
                }
            }

        }catch(Employeeexception e) {
            System.out.println(e);
            displayMenu();
        }
    }

    void userInputOne() {
        try{
            System.out.println("Enter ID: ");
            idInputValidation();

            System.out.println("Enter name: ");
            name = sc.next();
            arr.add("NAME: " + name);

            System.out.println("Enter department");
            department = sc.next();
            arr.add("DEPARTMENT: " + department);

            System.out.println("Enter designation: ");
            designation = (sc.next());
            arr.add("DESIGNATION: " + designation);

            System.out.println("Enter date of joining : ");
            String doeIn = sc.next();
            matchDate(doeIn);
            dateOfJoining = simpleDateFormat.parse(doeIn);
            arr.add("RESUMPTION DATE: " + String.valueOf(dateOfJoining));

            System.out.println("Enter date of birth: ");
            String dobIn = sc.next();
            matchDate(dobIn);
            dateOfBirth = simpleDateFormat.parse(dobIn);
            arr.add("BIRTHDAY: " + String.valueOf(dateOfBirth));

            System.out.println("Enter marital status: ");
            maritalStatus = sc.next();
            checkMaritalStatus();
            arr.add("MARITAL STATUS: " + maritalStatus);

            System.out.println("\nDATA SUCCESSFULLY UPLOADED......\n");
        }catch(Exception e) {
            if(e instanceof IllegalArgumentException){
                System.out.println("Invalid argument entered");
            }else{
                System.out.println("An error occurred. ");
            }
        }
    }


    void userInputTwo() {
        System.out.println("ENTER ID : ");
        idValidation();
    }

    void idInputValidation(){
        try{
            iD = sc.next().toLowerCase();
            char firstChar = iD.charAt(0);
            if (firstChar != 'e') {
                throw new Employeeexception("ID MOST START WITH 'e' \nTry again:");
            }else {
                arr.add("id: " + iD);
            }
        }catch(Employeeexception e) {
            System.out.println(e);
            idInputValidation();
        }
    }

    void userInputThree() {
        System.out.println("Exiting...... ");
        System.exit(0);
    }


    void matchDate(String inputDate) {
        Pattern dataRegex = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-([0-9]{4})");
        Matcher dateMatcher = dataRegex.matcher(inputDate);
        if(!dateMatcher.matches()) {
            System.out.println("Invalid Date Format Entered");
            System.out.println("Please try again! Expected format is DD-MM-YEAR");
            String newInput = sc.next();
            matchDate(newInput);
        }
    }

    void checkMaritalStatus() throws ParseException {
        if(maritalStatus.equals("married")) {
            System.out.println("Enter date of marriage: ");
            String dom = sc.next();
            matchDate(dom);
            dateOfMarriage = simpleDateFormat.parse(dom);
            arr.add("WEDDING DATE: " + String.valueOf(dateOfMarriage));
        }

    }
    void idValidation() {
        String inputID = sc.next().toLowerCase();

        if (inputID.compareTo(iD) == 0) {
            System.out.println("\n..........................................\n");

            List<String> sn = new ArrayList<>(arr);
            sn.forEach(System.out::println);

            System.out.println("\n..........................................\n");

        }else {
            System.out.println("INVALID ID.. \nEnter a correct ID below:");
            idValidation();
        }

    }

}
