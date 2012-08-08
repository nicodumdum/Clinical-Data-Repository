package com.esp.cdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esp.cdr.entity.Doctor;
import com.esp.cdr.repository.DoctorRepository;

@Controller
@RequestMapping("/admin/doctors")
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<Doctor> doctors = doctorRepository.findAll();
		uiModel.addAttribute("doctors", doctors);
		return "admin/doctors/index";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Integer id, Model uiModel) {
		Doctor doctor = doctorRepository.findOne(id);
		uiModel.addAttribute("doctor", doctor);
		return "admin/doctors/show";
	}
}