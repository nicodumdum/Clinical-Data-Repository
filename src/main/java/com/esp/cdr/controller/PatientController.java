package com.esp.cdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esp.cdr.entity.Patient;
import com.esp.cdr.repository.PatientRepository;

@Controller
@RequestMapping("/admin/patients")
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<Patient> patients = patientRepository.findAll();
		uiModel.addAttribute("patients", patients);
		return "admin/patients/index";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Integer id, Model uiModel) {
		Patient patient = patientRepository.findOne(id);
		uiModel.addAttribute("patient", patient);
		return "admin/patients/show";
	}
}