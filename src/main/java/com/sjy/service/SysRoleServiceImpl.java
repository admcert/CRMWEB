package com.sjy.service;

import com.sjy.entities.SysRole;
import com.sjy.repository.SysRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysRoleServiceImpl implements SysRoleService{
	
	@Autowired
	private SysRoleRepository sysRoleRepository;

	@Override
	public SysRole get(int id) {
		return sysRoleRepository.findOne(id);
	}

}
