package com.example.Producer.model;

public class Employee {

    private String empName;
    private String empCity;

    public Employee(String empName, String empCity) {
        this.empName = empName;
        this.empCity = empCity;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }
}
