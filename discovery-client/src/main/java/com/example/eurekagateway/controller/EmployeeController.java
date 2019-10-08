package com.example.eurekagateway.controller;

import com.example.eurekagateway.data.EmployeeModel;
import com.example.eurekagateway.service.api.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public Stream<EmployeeModel> getEmployee () {
        return  employeeService.getAllEmployee();
    }
}
