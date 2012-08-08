package com.esp.cdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esp.cdr.entity.ProfessionalBill;
import com.esp.cdr.repository.ProfessionalBillRepository;

@Controller
@RequestMapping("/admin/professionalbills")
public class ProfessionalBillController {
	
	@Autowired
	private ProfessionalBillRepository professionalBillRepository;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<ProfessionalBill> professionalBills = professionalBillRepository.findAll();
		uiModel.addAttribute("professionalBills", professionalBills);
		return "admin/professionalbills/index";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Integer id, Model uiModel) {
		ProfessionalBill professionalBill = professionalBillRepository.findOne(id);
		uiModel.addAttribute("professionalBill", professionalBill);
		return "admin/professionalbills/show";
	}
}