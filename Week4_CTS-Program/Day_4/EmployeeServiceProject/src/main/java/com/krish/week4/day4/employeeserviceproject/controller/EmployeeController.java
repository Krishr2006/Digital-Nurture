package com.krish.week4.day4.employeeserviceproject.controller;

import com.krish.week4.day4.employeeserviceproject.model.Employee;
import com.krish.week4.day4.employeeserviceproject.service.EmployeeService;
import com.krish.week4.day4.employeeserviceproject.dto.EmployeeDetailsResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String home() {
        return "Employee Service Running";
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/details/{id}")
    public EmployeeDetailsResponse getEmployeeDetails(@PathVariable int id) {
        return employeeService.getEmployeeDetails(id);
    }

}