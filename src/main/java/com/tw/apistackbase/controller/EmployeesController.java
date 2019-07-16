package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    private List<Employee> employees=Employee.createEmployeesList();
    @PostMapping()
    public Employee addEmployees(@RequestBody Employee employee){
            employees.add(employee);
            return employee;
    }

    @DeleteMapping
    public List<Employee> deleteEmployee(@RequestParam int id){
        employees.forEach(item->{
            if(item.getId()==id) employees.remove(item);
        });
        return employees;
    }
}


