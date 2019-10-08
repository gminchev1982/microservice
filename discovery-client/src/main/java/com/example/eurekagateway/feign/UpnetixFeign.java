package com.example.eurekagateway.feign;

import com.example.eurekagateway.data.UpnetixEmployeeModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("upnetix-service")
public interface UpnetixFeign {
    @GetMapping("/api/list")
    List<UpnetixEmployeeModel> getUpnetixEmployee();
}
