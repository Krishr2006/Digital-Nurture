package com.krish.week2.day3.iocdemo.controller;
import com.krish.week2.day3.iocdemo.model.Employee;
import com.krish.week2.day3.iocdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String home() {
        return "Welcome to Employee Management System";
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/searchById")
    public Employee searchById(@RequestParam int id) {
        return employeeService.searchById(id);
    }
    @GetMapping("/searchByName")
    public Employee searchByName(@RequestParam String name) {
        return employeeService.searchByName(name);
    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}