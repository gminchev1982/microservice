package com.example.eurekagateway.data;

public class EmployeeModel {
    Integer id;
    String name;
    Integer salary;
    String company;

    public EmployeeModel() {

    }

    public EmployeeModel(Integer id, String name, Integer salary, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
