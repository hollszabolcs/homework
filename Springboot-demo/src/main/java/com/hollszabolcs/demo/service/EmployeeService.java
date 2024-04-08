package com.hollszabolcs.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeService {
    public String getUpperCaseName(String name) {
        return name.toUpperCase();
    }

}
