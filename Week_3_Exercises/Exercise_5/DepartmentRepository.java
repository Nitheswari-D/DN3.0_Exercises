package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Derived query method to find department by name
    Department findByName(String name);

    // Custom query method using @Query annotation to find departments with more than a certain number of employees
    @Query("SELECT d FROM Department d WHERE size(d.employees) > :employeeCount")
    List<Department> findDepartmentsWithMoreThanEmployees(int employeeCount);
}
