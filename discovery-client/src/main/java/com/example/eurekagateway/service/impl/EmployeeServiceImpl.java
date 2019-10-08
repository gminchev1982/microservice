package com.example.eurekagateway.service.impl;

import com.example.eurekagateway.data.EmployeeModel;
import com.example.eurekagateway.service.api.EmployeeService;
import com.example.eurekagateway.service.api.ScaleFocusService;
import com.example.eurekagateway.service.api.UpnetixService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final ScaleFocusService scaleFocusService;
    private final UpnetixService upnetixService;

    public EmployeeServiceImpl(ScaleFocusService scaleFocusService, UpnetixService upnetixService) {
        this.scaleFocusService  = scaleFocusService;
        this.upnetixService  = upnetixService;
    }

    @Override
    public Stream<EmployeeModel> getAllEmployee() {

        List<EmployeeModel> scaleFocus =
                      scaleFocusService.getScaleFocusEmployee()
                      .stream()
                      .map(x->new EmployeeModel(x.getId(), x.getFirstName(), x.getSalary(), "ScaleFocus"))
                      .collect(Collectors.toList());

        List<EmployeeModel> upnetix =
                upnetixService.getUpnetixEmployee()
                        .stream()
                        .map(x->new EmployeeModel(x.getId(), x.getName(), x.getMoney(), "Upnetix")).collect(Collectors.toList());

        Stream<EmployeeModel> combinedStream = Stream.of(scaleFocus, upnetix).flatMap(Collection::stream);


        return combinedStream;
    }
}
