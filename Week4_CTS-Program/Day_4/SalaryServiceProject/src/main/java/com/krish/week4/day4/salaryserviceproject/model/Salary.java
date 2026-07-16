package com.krish.week4.day4.salaryserviceproject.model;

public class Salary {

    private int id;
    private int employeeId;
    private double salary;
    private double bonus;

    public Salary() {
    }

    public Salary(int id, int employeeId, double salary, double bonus) {
        this.id = id;
        this.employeeId = employeeId;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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