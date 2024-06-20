package com.hollszabolcs.demo.service;

import com.hollszabolcs.demo.model.Employee;
import com.hollszabolcs.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findByName(String name){
        final var employee =employeeRepository.findByName(name);
        return employee;
    }

}
