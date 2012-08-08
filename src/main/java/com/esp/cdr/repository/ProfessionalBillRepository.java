package com.esp.cdr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esp.cdr.entity.ProfessionalBill;

@Repository
public interface ProfessionalBillRepository extends JpaRepository<ProfessionalBill, Integer>{
	
}