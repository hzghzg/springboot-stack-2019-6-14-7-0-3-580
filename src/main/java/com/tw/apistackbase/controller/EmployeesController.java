package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    private List<Employee> employees=new ArrayList<>();
    @PostMapping()
    public Employee addEmployees(@RequestBody Employee employee){
            employees.add(employee);
            return employee;
        }
    }


