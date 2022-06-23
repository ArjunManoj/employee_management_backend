package com.dev.employee_management.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Employee {
    @Id
    @Column(name = "emp_id", nullable = false)
    @Generated
    private Integer id;

    private String name;

    private Double salary;

    private Double tax;
}
