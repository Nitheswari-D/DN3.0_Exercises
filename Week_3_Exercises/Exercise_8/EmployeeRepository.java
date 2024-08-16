package com.example.employeemanagement.repository;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.projection.EmployeeProjection;
import com.example.employeemanagement.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Interface-based projection
    List<EmployeeProjection> findAllProjectedBy();

    // Class-based projection using constructor expression
    @Query("SELECT new com.example.employeemanagement.dto.EmployeeDTO(e.id, e.name, e.department) FROM Employee e")
    List<EmployeeDTO> findAllEmployeeDTOs();
}
