package com.dev.employee_management.service;

import com.dev.employee_management.entity.Department;
import com.dev.employee_management.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department getDepartment(Integer id){
        Optional<Department> optional = departmentRepository.findById(id);
        return optional.get();
    }
}
