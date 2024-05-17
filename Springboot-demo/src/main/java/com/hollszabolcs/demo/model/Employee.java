package com.hollszabolcs.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int age;
}





