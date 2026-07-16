package com.krish.week4.day4.employeeserviceproject.dto;

public class EmployeeDetailsResponse {

    private int employeeId;
    private String employeeName;

    private String departmentName;
    private String location;

    private double salary;
    private double bonus;

    public EmployeeDetailsResponse() {
    }

    public EmployeeDetailsResponse(int employeeId,
                                   String employeeName,
                                   String departmentName,
                                   String location,
                                   double salary,
                                   double bonus) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentName = departmentName;
        this.location = location;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}