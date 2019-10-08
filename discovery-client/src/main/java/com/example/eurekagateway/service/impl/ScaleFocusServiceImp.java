package com.example.eurekagateway.service.impl;

import com.example.eurekagateway.data.ScaleFocusEmployeeModel;
import com.example.eurekagateway.feign.ScaleFocusFeign;
import com.example.eurekagateway.service.api.ScaleFocusService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScaleFocusServiceImp implements ScaleFocusService {

    private final ScaleFocusFeign scalefocusEmployee;

    public ScaleFocusServiceImp(ScaleFocusFeign scaleFocusEndpoint) {
      this.scalefocusEmployee = scaleFocusEndpoint;

    }

    public List<ScaleFocusEmployeeModel> readEmployeeMore300() {
        return scalefocusEmployee.readEmployee().stream().filter(x->x.getSalary()>310).collect(Collectors.toList());
    }

    @Override
    public List<ScaleFocusEmployeeModel> getScaleFocusEmployee() {
        return scalefocusEmployee.readEmployee();
    }
}
