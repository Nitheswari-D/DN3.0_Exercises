package com.example.employeemanagement.repository;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.projection.DepartmentProjection;
import com.example.employeemanagement.dto.DepartmentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Interface-based projection
    List<DepartmentProjection> findAllProjectedBy();

    // Class-based projection using constructor expression
    @Query("SELECT new com.example.employeemanagement.dto.DepartmentDTO(d.id, d.name) FROM Department d")
    List<DepartmentDTO> findAllDepartmentDTOs();
}
