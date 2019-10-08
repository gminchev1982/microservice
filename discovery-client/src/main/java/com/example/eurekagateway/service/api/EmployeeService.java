package com.example.eurekagateway.service.api;

import com.example.eurekagateway.data.EmployeeModel;

import java.util.List;
import java.util.stream.Stream;

public interface EmployeeService {

    Stream<EmployeeModel> getAllEmployee ();
}
