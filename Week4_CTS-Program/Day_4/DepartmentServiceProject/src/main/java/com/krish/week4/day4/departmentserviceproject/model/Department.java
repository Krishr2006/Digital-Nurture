package com.krish.week4.day4.departmentserviceproject.model;

public class Department {

    private int id;
    private String departmentName;
    private String location;

    public Department() {
    }

    public Department(int id, String departmentName, String location) {
        this.id = id;
        this.departmentName = departmentName;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}