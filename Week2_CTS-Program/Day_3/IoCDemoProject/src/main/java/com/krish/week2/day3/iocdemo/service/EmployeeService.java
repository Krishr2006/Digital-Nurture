package com.krish.week2.day3.iocdemo.service;
import com.krish.week2.day3.iocdemo.model.Employee;
import org.springframework.stereotype.Service;
import com.krish.week2.day3.iocdemo.exception.EmployeeNotFoundException;
import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    public EmployeeService() {
        employees.add(new Employee(101, "Krish", "AI & DS","K2006@gmail.com"));
        employees.add(new Employee(102, "Rahul", "Computer Science","RR2006@gmail.com"));
        employees.add(new Employee(103, "Ravi", "Information Technology","R2006@gmail.com"));
        employees.add(new Employee(104, "Priya", "Artificial Intelligence","P2006@gmail.com"));
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public Employee getEmployeeById(int id) {

        for (Employee employee : employees) {

            if (employee.getId() == id) {
                return employee;
            }

        }

        throw new EmployeeNotFoundException(
                "Employee with ID " + id + " not found."
        );

    }
    public Employee searchById(int id) {

        for (Employee employee : employees) {

            if (employee.getId() == id) {
                return employee;
            }

        }

        return null;

    }
    public Employee searchByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(updatedEmployee.getName());
                employee.setDepartment(updatedEmployee.getDepartment());
                employee.setEmail(updatedEmployee.getEmail());
                return employee;
            }
        }
        return null;
    }
    public String deleteEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                return "Employee Deleted Successfully.";
            }
        }
        return "Employee Not Found.";
    }
}