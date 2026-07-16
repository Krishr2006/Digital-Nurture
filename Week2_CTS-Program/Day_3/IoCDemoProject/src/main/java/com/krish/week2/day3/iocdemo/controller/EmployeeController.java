package com.krish.week2.day3.iocdemo.controller;

import com.krish.week2.day3.iocdemo.model.Employee;
import com.krish.week2.day3.iocdemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Home Endpoint
    @GetMapping("/")
    public String home() {
        logger.info("Home API called.");
        return "Welcome to Employee Management System";
    }

    // Returns all employees
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        logger.info("Fetching all employees.");
        return employeeService.getEmployees();
    }

    // Returns employee by ID
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        logger.info("Fetching employee with ID: {}", id);
        return employeeService.getEmployeeById(id);
    }

    // Search employee using Request Parameter (ID)
    @GetMapping("/searchById")
    public Employee searchById(@RequestParam int id) {
        return employeeService.searchById(id);
    }

    // Search employee using Request Parameter (Name)
    @GetMapping("/searchByName")
    public Employee searchByName(@RequestParam String name) {
        return employeeService.searchByName(name);
    }

    // Update employee details
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable int id,
                                   @RequestBody Employee employee) {
        logger.info("Updating employee with ID: {}", id);
        return employeeService.updateEmployee(id, employee);
    }

    // Delete employee
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        logger.info("Deleting employee with ID: {}", id);
        return employeeService.deleteEmployee(id);
    }

}