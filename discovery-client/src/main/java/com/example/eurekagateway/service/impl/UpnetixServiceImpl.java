package com.example.eurekagateway.service.impl;

import com.example.eurekagateway.data.UpnetixEmployeeModel;
import com.example.eurekagateway.feign.UpnetixFeign;
import com.example.eurekagateway.service.api.UpnetixService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UpnetixServiceImpl  implements UpnetixService {

    private final UpnetixFeign upnetixEndPoint;

    public UpnetixServiceImpl(UpnetixFeign upnetixEndPoint) {
        this.upnetixEndPoint = upnetixEndPoint;
    }

    @Override
    public List<UpnetixEmployeeModel> getUpnetixEmployee() {
        return  upnetixEndPoint.getUpnetixEmployee();
    }
}
