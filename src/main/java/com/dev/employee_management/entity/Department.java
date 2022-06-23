package com.dev.employee_management.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @Column(name = "dept_id", nullable = false)
    @Generated
    private Integer id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private List<Employee> employeeList;

}
