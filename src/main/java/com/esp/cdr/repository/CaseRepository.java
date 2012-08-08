package com.esp.cdr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esp.cdr.entity.Case;

@Repository
public interface CaseRepository extends JpaRepository<Case, Integer>{
	
}