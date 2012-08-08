package com.esp.cdr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esp.cdr.entity.CardiacCase;

@Repository
public interface CardiacCaseRepository extends JpaRepository<CardiacCase, Integer>{
	
}