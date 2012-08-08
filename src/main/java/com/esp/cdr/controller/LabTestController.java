package com.esp.cdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esp.cdr.entity.LabTest;
import com.esp.cdr.repository.LabTestRepository;

@Controller
@RequestMapping("/admin/labtests")
public class LabTestController {
	
	@Autowired
	private LabTestRepository labTestRepository;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<LabTest> labTests = labTestRepository.findAll();
		uiModel.addAttribute("labTests", labTests);
		return "admin/labtests/index";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Integer id, Model uiModel) {
		LabTest labTest = labTestRepository.findOne(id);
		uiModel.addAttribute("labTest", labTest);
		return "admin/labtests/show";
	}
}