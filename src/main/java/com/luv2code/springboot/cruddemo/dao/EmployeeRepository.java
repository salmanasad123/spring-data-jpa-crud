package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Employee, Integer>
// entity type: Employee
// PrimaryKey type: Integer because our employee is based on integer primary key type
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
