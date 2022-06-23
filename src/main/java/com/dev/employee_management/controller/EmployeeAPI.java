package com.dev.employee_management.controller;

import com.dev.employee_management.entity.Department;
import com.dev.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping
public class EmployeeAPI {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "department/{id}")
    public Department getDepartment(@PathVariable Integer id){
        return employeeService.getDepartment(id);
    }
}
