package Assignment03;

import java.util.Date;

public class Employee {
    String employeeId;
    String employeeName;
    String employeeDepartment;
    String designation;
    Date dateEmployed;
    Date dateOfBirth;
    MaritalStatus maritalStatus;
    Date dateOfMarriage;

    public Employee(String employeeId, String employeeName, String employeeDepartment, String designation,
                           Date dateEmployed, Date dateOfBirth, MaritalStatus maritalStatus){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.designation = designation;
        this.dateEmployed = dateEmployed;
        this.dateOfBirth = dateEmployed;
        this.maritalStatus = maritalStatus;
    }

    public Employee(String employeeId, String employeeName, String employeeDepartment, String designation,
                           Date dateEmployed, Date dateOfBirth, MaritalStatus maritalStatus, Date dateOfMarriage){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.designation = designation;
        this.dateEmployed = dateEmployed;
        this.dateOfBirth = dateEmployed;
        this.maritalStatus = maritalStatus;
        this.dateOfMarriage = dateOfMarriage;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateEmployed() {
        return dateEmployed;
    }

    public void setDateEmployed(Date dateEmployed) {
        this.dateEmployed = dateEmployed;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getDateOfMarriage() {
        return dateOfMarriage;
    }

    public void setDateOfMarriage(Date dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }
}
