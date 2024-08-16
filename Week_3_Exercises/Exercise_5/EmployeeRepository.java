package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query method to find employees by department name
    List<Employee> findByDepartmentName(String departmentName);

    // Custom query method using @Query annotation to find employees by email domain
    @Query("SELECT e FROM Employee e WHERE e.email LIKE %:domain")
    List<Employee> findByEmailDomain(String domain);
}
