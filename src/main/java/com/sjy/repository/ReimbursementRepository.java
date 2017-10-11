package com.sjy.repository;


import java.util.Date;
import java.util.List;

import com.sjy.entities.Reimbursement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer>{
        List<Reimbursement> findByStatus(String status);
        Page<Reimbursement> findAll(Pageable pageable);
        Page<Reimbursement> findByCreatTimeAfterAndCreatTimeBefore(Date begin, Date end, Pageable pageable);
}
