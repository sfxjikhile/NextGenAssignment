package com.assignment.solutions.assignment5;


public class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;
    private String dateOfJoining;
    private String dateOfBirth;
    private String maritalStatus;
    private String dateOfMarriage;

    public Employee(int id, String name, String department, String designation, String dateOfJoining, String dateOfBirth, String maritalStatus, String dateOfMarriage) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.dateOfMarriage = dateOfMarriage;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDateOfMarriage() {
        return dateOfMarriage;
    }

    public void setDateOfMarriage(String dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }

}
