package com.krish.week4.day4.salaryserviceproject.controller;

import com.krish.week4.day4.salaryserviceproject.model.Salary;
import com.krish.week4.day4.salaryserviceproject.service.SalaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salaries")
public class SalaryController {

    private final SalaryService salaryService;

    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @GetMapping("/")
    public String home() {
        return "Salary Service Running";
    }

    @GetMapping
    public List<Salary> getSalaries() {
        return salaryService.getSalaries();
    }

    @GetMapping("/{id}")
    public Salary getSalary(@PathVariable int id) {
        return salaryService.getSalaryById(id);
    }

}