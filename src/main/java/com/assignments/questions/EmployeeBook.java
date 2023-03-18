package com.assignments.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeBook {
    private String iD;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public static void main(String [] args){
        EmployeeBook displayMenu = new EmployeeBook();

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME ENTER 0 TO DISPLAY MENU: ");

        int num = sc.nextInt();
        Map<String, String> hmap = new HashMap<>();

        if(num == 0) {
            while(true) {
                // Displayed Menu
                System.out.println("1. Enter Data \n2. Display Data \n3. Exit\n Input Menu Option: ");

                int userInput = sc.nextInt();

                if (userInput == 1) {
                    System.out.println("Enter ID: ");
                    String iD = sc.next();
                    displayMenu.setID(iD);
                    hmap.put("ID: ", displayMenu.getID());

                    System.out.println("Enter name: ");
                    String name = sc.next();
                    hmap.put("NAME: ", name);

                    System.out.println("Enter department");
                    String department = sc.next();
                    hmap.put("DEPARTMENT: ", department);

                    System.out.println("Enter designation: ");
                    String designation = (sc.next());
                    hmap.put("DESIGNATION: ", designation);

                    System.out.println("Enter date of joining : ");
                    String dateOfJoining = sc.next();
                    hmap.put("RESUMPTION DATE: ", dateOfJoining);

                    System.out.println("Enter date of birth: ");
                    String dateOfBirth = sc.next();
                    hmap.put("BIRTHDAY: ", dateOfBirth);

                    System.out.println("Enter marital status: ");
                    String maritalStatus = sc.next();
                    hmap.put("MARITAL STATUS: ", maritalStatus);
                    if(maritalStatus.equals("married")) {
                        System.out.println("Enter date of marriage: ");
                        String dateOfMarriage = sc.next();
                        hmap.put("WEDDING DATE: ", dateOfMarriage);
                    }
                }else if (userInput == 2) {
                    System.out.println("ENTER ID NUMBER: ");
                    int inputID = sc.nextInt();
                    int inputIDToString = Integer.parseInt(displayMenu.getID());
                    if (inputID == inputIDToString) {
                        System.out.println("\n..........................................\n");
                        for (Map.Entry<String, String> s: hmap.entrySet()){
                            System.out.println(s.getKey()  + s.getValue());
                        }
                        System.out.println("\n..........................................\n");

                    }else{
                        System.out.println("INVALID ID");
                    }
                }else if (userInput == 3) {
                    System.out.println("Exiting...... ");
                    System.exit(0);
                }

            }

        }

    }

}