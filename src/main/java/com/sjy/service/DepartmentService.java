package com.sjy.service;

import com.sjy.entities.Department;

import java.util.List;


public interface DepartmentService {
       List<Department> getAll();
       
       Department getByDp_name(String dpName);
       
       Department get(int dpId);
       
       void modify(Department department);
       void remove(int dpId);
       
       void add(Department department);
}
