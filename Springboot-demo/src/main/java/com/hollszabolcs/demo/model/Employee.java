package com.hollszabolcs.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "employees")
@Data
@Getter
@Setter
public class Employee {
    @Id
    private int id;
    private String name;
    private int age;
}





