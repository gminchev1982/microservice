package com.example.eurekagateway.service.api;

import com.example.eurekagateway.data.ScaleFocusEmployeeModel;

import java.util.List;

public interface ScaleFocusService {

    List<ScaleFocusEmployeeModel> getScaleFocusEmployee ();
    List<ScaleFocusEmployeeModel> readEmployeeMore300();
}
