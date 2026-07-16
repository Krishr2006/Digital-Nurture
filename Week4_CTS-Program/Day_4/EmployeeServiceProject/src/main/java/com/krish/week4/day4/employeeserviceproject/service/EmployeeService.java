package com.krish.week4.day4.employeeserviceproject.service;

import com.krish.week4.day4.employeeserviceproject.dto.DepartmentResponse;
import com.krish.week4.day4.employeeserviceproject.dto.EmployeeDetailsResponse;
import com.krish.week4.day4.employeeserviceproject.dto.SalaryResponse;
import org.springframework.web.client.RestTemplate;

import com.krish.week4.day4.employeeserviceproject.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final RestTemplate restTemplate;

    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Employee> getEmployees() {

        return List.of(

                new Employee(101, "Krish", 1, 1001),
                new Employee(102, "Rahul", 2, 1002),
                new Employee(103, "Priya", 3, 1003)

        );

    }

    public Employee getEmployeeById(int id) {

        return getEmployees()
                .stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElse(null);

    }
    public EmployeeDetailsResponse getEmployeeDetails(int id) {

        Employee employee = getEmployeeById(id);

        DepartmentResponse department =
                restTemplate.getForObject(
                        "http://localhost:8082/departments/" + employee.getDepartmentId(),
                        DepartmentResponse.class);

        SalaryResponse salary =
                restTemplate.getForObject(
                        "http://localhost:8083/salaries/" + employee.getSalaryId(),
                        SalaryResponse.class);

        return new EmployeeDetailsResponse(
                employee.getId(),
                employee.getName(),
                department.getDepartmentName(),
                department.getLocation(),
                salary.getSalary(),
                salary.getBonus()
        );

    }

}