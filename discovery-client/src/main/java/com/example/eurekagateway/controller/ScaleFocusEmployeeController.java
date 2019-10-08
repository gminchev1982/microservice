package com.example.eurekagateway.controller;

import com.example.eurekagateway.data.ScaleFocusEmployeeModel;
import com.example.eurekagateway.service.api.ScaleFocusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScaleFocusEmployeeController {

    private final ScaleFocusService scaleFocusService;

    public ScaleFocusEmployeeController(ScaleFocusService scaleFocusService) {
        this.scaleFocusService = scaleFocusService;
    }

    @GetMapping("/scale")
    public List<ScaleFocusEmployeeModel> getEmployee () {
            return  scaleFocusService.getScaleFocusEmployee();
    }

    @GetMapping("/scale300")
    public List<ScaleFocusEmployeeModel> getEmployee300 () {
        return  scaleFocusService.readEmployeeMore300();

    }


}
