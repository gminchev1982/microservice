package com.minchev.upnetix.service;

import com.minchev.upnetix.db.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    Boolean save();
    //LabServiceEditModel edit(LabServiceEditModel labServiceEditModel);
    List<EmployeeEntity> findAll();
}
