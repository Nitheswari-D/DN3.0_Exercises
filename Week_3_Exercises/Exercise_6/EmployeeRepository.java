package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Pagination and sorting for finding all employees
    Page<Employee> findAll(Pageable pageable);

    // Pagination and sorting for finding employees by department
    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);
}
