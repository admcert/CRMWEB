package com.sjy.service;

import com.sjy.controllers.util.GetCurrentInfo;
import com.sjy.entities.Reimbursement;
import com.sjy.entities.User;
import com.sjy.repository.ReimbursementRepository;
import com.sjy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReimbursementServiceImpl implements ReimbursementService{
   
	@Autowired
	private ReimbursementRepository reimbursementRepository;
	
	@Autowired
	private GetCurrentInfo getCurrentInfo;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Reimbursement> auditedRb(String status) {
	         return reimbursementRepository.findByStatus(status);
	}

	@Override
	public void check(String status,Integer rbId) {
		Reimbursement rb=this.reimbursementRepository.findOne(rbId);
		Date checkTime=new Date();
		UserDetails userDetails=this.getCurrentInfo.getCurrentInfo();
		User checkUser=this.userRepository.findByUsername(userDetails.getUsername());
		rb.setCheckUser(checkUser);
		rb.setCheckTime(checkTime);
		rb.setStatus(status);
		this.reimbursementRepository.save(rb);
	}

	@Override
	public  Page<Reimbursement> getAll(Integer page,Integer size) {
	         Page<Reimbursement> pageContent=this.reimbursementRepository.findAll(new PageRequest(page, size));
             return pageContent;
	}

	@Override
	public Page<Reimbursement> queryByDate(Integer page, Integer size, Date begin, Date end) {
		 return this.reimbursementRepository.findByCreatTimeAfterAndCreatTimeBefore(begin, end, new PageRequest(page, size));
	}

	@Override
	public void apply(Reimbursement reimbursement) {
	 this.reimbursementRepository.save(reimbursement);
		
	}

}
