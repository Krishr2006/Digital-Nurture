package com.krish.week4.day4.employeeserviceproject.model;

public class Employee {

    private int id;
    private String name;
    private int departmentId;
    private int salaryId;

    public Employee() {
    }

    public Employee(int id, String name, int departmentId, int salaryId) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.salaryId = salaryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}