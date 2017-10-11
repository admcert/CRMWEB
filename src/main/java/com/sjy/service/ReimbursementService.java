package com.sjy.service;

import com.sjy.entities.Reimbursement;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;


public interface ReimbursementService {
     List<Reimbursement> auditedRb(String status);
     
     void check(String status, Integer rbId);
     
     Page<Reimbursement> getAll(Integer page, Integer size);
     
     Page<Reimbursement> queryByDate(Integer page, Integer size, Date begin, Date end);
     
     void apply(Reimbursement reimbursement);
}
