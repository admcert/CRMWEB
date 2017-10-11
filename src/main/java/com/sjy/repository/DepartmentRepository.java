package com.sjy.repository;

import com.sjy.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    Department findByDpName(String dpName);
}
