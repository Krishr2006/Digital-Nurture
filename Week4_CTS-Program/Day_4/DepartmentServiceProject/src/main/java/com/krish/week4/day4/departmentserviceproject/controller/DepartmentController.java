package com.krish.week4.day4.departmentserviceproject.controller;

import com.krish.week4.day4.departmentserviceproject.model.Department;
import com.krish.week4.day4.departmentserviceproject.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/")
    public String home() {
        return "Department Service Running";
    }

    @GetMapping
    public List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }
}