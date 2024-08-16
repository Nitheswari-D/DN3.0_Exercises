package com.example.employeemanagement.dto;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String department;

    public EmployeeDTO(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters and setters
}
