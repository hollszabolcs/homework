package com.hollszabolcs.demo.controller;

import com.hollszabolcs.demo.model.Employee;
import com.hollszabolcs.demo.repository.EmployeeRepository;
import com.hollszabolcs.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee")
    List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @GetMapping("rin{name}")
    public String getUpperClassNames(@PathVariable(required = false) String name) {
        if (name == null) {
            return "No name provided";
        }
        String upperCaseName = employeeService.getUpperCaseName(name);
        return "Upper case name: " + upperCaseName;
    }
}
