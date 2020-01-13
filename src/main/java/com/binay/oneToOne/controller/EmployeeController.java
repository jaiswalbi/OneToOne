package com.binay.oneToOne.controller;

import com.binay.oneToOne.entity.Employee;
import com.binay.oneToOne.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){

        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }
}
