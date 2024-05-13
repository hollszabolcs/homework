package com.hollszabolcs.demo.controller;

import com.hollszabolcs.demo.model.Employee;
import com.hollszabolcs.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/employee")
    Employee addEmployee(@RequestBody Employee employee) {
        log.info("Adding an employee{}", employee);
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee2")
    List<Employee> getEmployee(@RequestParam String name) {
        log.info("Finding people by name {}", name);
        return employeeService.findByName(name);
    }
}
