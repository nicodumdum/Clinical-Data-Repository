package com.esp.cdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esp.cdr.entity.Case;
import com.esp.cdr.repository.CaseRepository;

@Controller
@RequestMapping("/admin/cases")
public class CaseController {
	
	@Autowired
	private CaseRepository caseRepository;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<Case> cases = caseRepository.findAll();
		uiModel.addAttribute("cases", cases);
		return "admin/cases/index";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Integer id, Model uiModel) {
		Case singleCase = caseRepository.findOne(id); // Cannot use variable "case" because considered as special variable/token in java
		uiModel.addAttribute("singleCase", singleCase);
		return "admin/cases/show";
	}
}