package com.sjy.service;

import com.sjy.entities.Department;
import com.sjy.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> getAll() {
		return this.departmentRepository.findAll();
	}
	
	@Override
	public Department getByDp_name(String dpName) {		
		return this.departmentRepository.findByDpName(dpName);
	}

	@Override
	public Department get(int dpId) {
		return this.departmentRepository.findOne(dpId);
	}

	@Override
	public void modify(Department department) {
		System.out.println(department.getDpId());
	this.departmentRepository.save(department);
		
	}

	@Override
	public void remove(int dpId) {
		this.departmentRepository.delete(dpId);
		
	}

	@Override
	public void add(Department department) {
		this.departmentRepository.save(department);
		
	}

}
