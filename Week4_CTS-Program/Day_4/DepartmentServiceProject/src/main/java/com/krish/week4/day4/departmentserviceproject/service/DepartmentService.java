package com.krish.week4.day4.departmentserviceproject.service;

import com.krish.week4.day4.departmentserviceproject.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    public List<Department> getDepartments() {

        return List.of(
                new Department(1, "AI & DS", "Block A"),
                new Department(2, "Computer Science", "Block B"),
                new Department(3, "Information Technology", "Block C")
        );

    }

    public Department getDepartmentById(int id) {

        return getDepartments()
                .stream()
                .filter(department -> department.getId() == id)
                .findFirst()
                .orElse(null);

    }

}