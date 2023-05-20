package com.assignment.solutions.assignment12.number3;

public class ProcessDetails <T extends EmployeeManagement & EmployeeInfo>{
    T obj;

    public ProcessDetails(T obj) {
        this.obj = obj;
    }

    public void enterDetails(){
        obj.inputDetails();
        System.out.println();
    }

    public void displayAllDetails(){
        obj.displayDetails();
        System.out.println();
    }



}