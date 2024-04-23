package com.hollszabolcs.demo.controller;

import com.hollszabolcs.demo.model.Employee;
import com.hollszabolcs.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/addemployee")
    Employee addEmployee(@RequestBody Employee employee){
        log.info("Adding an employee{}",employee);
        return employeeService.addEmployee(employee);
    }
}
