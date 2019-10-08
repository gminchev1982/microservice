package com.example.eurekagateway.feign;

import com.example.eurekagateway.data.ScaleFocusEmployeeModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("employee-service")
public interface ScaleFocusFeign {
    @GetMapping("/api/list")
    List<ScaleFocusEmployeeModel> readEmployee();
}
