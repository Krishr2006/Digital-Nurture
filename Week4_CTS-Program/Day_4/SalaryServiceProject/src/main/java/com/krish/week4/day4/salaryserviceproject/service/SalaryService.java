package com.krish.week4.day4.salaryserviceproject.service;

import com.krish.week4.day4.salaryserviceproject.model.Salary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    public List<Salary> getSalaries() {

        return List.of(

                new Salary(1001, 101, 50000, 5000),
                new Salary(1002, 102, 60000, 7000),
                new Salary(1003, 103, 55000, 6000)

        );

    }

    public Salary getSalaryById(int id) {

        return getSalaries()
                .stream()
                .filter(salary -> salary.getId() == id)
                .findFirst()
                .orElse(null);

    }

}