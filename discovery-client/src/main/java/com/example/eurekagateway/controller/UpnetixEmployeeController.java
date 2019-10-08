package com.example.eurekagateway.controller;

import com.example.eurekagateway.data.UpnetixEmployeeModel;
import com.example.eurekagateway.service.api.UpnetixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UpnetixEmployeeController {

    private final UpnetixService upnetixService;

    public UpnetixEmployeeController(UpnetixService upnetixService) {
        this.upnetixService = upnetixService;
    }

    @GetMapping("/upx")
    public List<UpnetixEmployeeModel> getUpxEmployee () {
        return  upnetixService.getUpnetixEmployee();
    }

}
