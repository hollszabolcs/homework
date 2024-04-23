package com.hollszabolcs.demo.repository;

import com.hollszabolcs.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
