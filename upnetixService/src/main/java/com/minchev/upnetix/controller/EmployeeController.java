package com.minchev.upnetix.controller;


import com.minchev.upnetix.db.EmployeeEntity;
import com.minchev.upnetix.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
       // save ();
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<EmployeeEntity> getEmployeeList() {
        List<EmployeeEntity> list = employeeService.findAll();
       return  list;
    }



}
