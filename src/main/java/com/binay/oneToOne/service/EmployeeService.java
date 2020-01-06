package com.binay.oneToOne.service;

import com.binay.oneToOne.entity.Employee;
import com.binay.oneToOne.entity.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
}
