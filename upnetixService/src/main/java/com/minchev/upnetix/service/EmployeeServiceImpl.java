package com.minchev.upnetix.service;

import com.minchev.upnetix.db.EmployeeEntity;
import com.minchev.upnetix.db.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl  implements  EmployeeService{

    private EmployeeEntity employeeEntity;
    private final EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeEntity = employeeEntity;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Boolean save() {
        for (Integer i=1000; i<100000; i++) {
            employeeEntity = new EmployeeEntity(i+2, "Pesho",  i);
            employeeRepository.save(employeeEntity);
        }

        return true;
    }

    @Override
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findByMoney();
    }
}
