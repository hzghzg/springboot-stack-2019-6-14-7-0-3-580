package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private  int id;
    private  String name;
    private int age;
    private String gender;

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public static List<Employee> createEmployeesList(){
        List<Employee> employeesList=new ArrayList<>();
        employeesList.add(new Employee(0,"Xiaoming",20,"Male"));
        employeesList.add(new Employee(1,"Xiaohong",19,"Female"));
        employeesList.add(new Employee(2,"Xiaozhi",15,"Male"));
        return employeesList;
    }
}
