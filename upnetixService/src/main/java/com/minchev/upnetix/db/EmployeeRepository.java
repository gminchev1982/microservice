package com.minchev.upnetix.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    @Query(
            value = "SELECT * FROM employee e  Limit 20",
            nativeQuery = true)
    List<EmployeeEntity> findByMoney();





}
