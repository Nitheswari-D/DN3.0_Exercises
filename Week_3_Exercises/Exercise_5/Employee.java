package com.example.employeemanagementsystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employees")
@NamedQueries({
    @NamedQuery(name = "Employee.findByLastName",
                query = "SELECT e FROM Employee e WHERE e.name LIKE :lastName%")
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    // getters and setters
}
