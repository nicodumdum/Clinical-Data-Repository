package com.esp.cdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esp.cdr.entity.CardiacCase;
import com.esp.cdr.repository.CardiacCaseRepository;

@Controller
@RequestMapping("/admin/cardiaccases")
public class CardiacCaseController {
	
	@Autowired
	private CardiacCaseRepository cardiacCaseRepository;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<CardiacCase> cardiacCases = cardiacCaseRepository.findAll();
		uiModel.addAttribute("cardiacCases", cardiacCases);
		return "admin/cardiaccases/index";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Integer id, Model uiModel) {
		CardiacCase cardiacCase = cardiacCaseRepository.findOne(id);
		uiModel.addAttribute("cardiacCase", cardiacCase);
		return "admin/cardiaccases/show";
	}
}