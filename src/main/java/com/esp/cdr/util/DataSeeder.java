package com.esp.cdr.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.esp.cdr.entity.CardiacCase;
import com.esp.cdr.entity.Case;
import com.esp.cdr.entity.Doctor;
import com.esp.cdr.entity.LabTest;
import com.esp.cdr.entity.Patient;
import com.esp.cdr.entity.ProfessionalBill;
import com.esp.cdr.repository.CardiacCaseRepository;
import com.esp.cdr.repository.CaseRepository;
import com.esp.cdr.repository.DoctorRepository;
import com.esp.cdr.repository.LabTestRepository;
import com.esp.cdr.repository.PatientRepository;
import com.esp.cdr.repository.ProfessionalBillRepository;

@Profile("dataSeeder")
@Component
public class DataSeeder 
{
	@Autowired
	private CardiacCaseRepository cardiacCaseRepository;
	
	@Autowired
	private CaseRepository caseRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private LabTestRepository labTestRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private ProfessionalBillRepository professionalBillRepository;
	
	@PostConstruct
	public void run()
	{
		Patient p = new Patient();
		p.setName("Tina Moran");
		p.setAddress("RedLite District");
		p.setContactNumber("669-6969");
		p.setGender("Female");
		p.setBirthdate("June 9, 1969");
		p = patientRepository.save(p);
		
		Doctor d = new Doctor();
		d.setName("Dr. Mike Litoris");
		d.setAddress("Silicon Valley");
		d.setContactNumber("772-2255");
		d.setGender("Male");
		d.setBirthdate("April 10, 1981");
		d.setSpecialty("OB-GYNE");
		d = doctorRepository.save(d);
		
		CardiacCase cc = new CardiacCase();
		cc.setPatient(p);
		cc.setDoctor(d);
		cc.setDate("August 10, 2012");
		cc.setCaseReport("Severe Cardiac Arrest");
		cc = cardiacCaseRepository.save(cc);
		
		Case c = new Case();
		c.setUnitInfo("Unit Info");
		c.setCensusInfo("Census Info");
		c.setMedication("Viagra");
		c.setVisitationType("Special Visit");
		c.setInsurance("Lifetime");
		c.setCosts(69);
		c.setCharges(69);
		c.setReimbursement(69);
		c.setPatient(p);
		c = caseRepository.save(c);
		
		LabTest lt = new LabTest();
		lt.setTestType("Pap Smear Test");
		lt.setTestDate("August 10, 2012");
		lt.setConductor("Mr. Tester");
		lt.setCases(c);
		lt = labTestRepository.save(lt);
		
		ProfessionalBill pb = new ProfessionalBill();
		pb.setDate("August 10, 2012");
		pb.setDiagnoses("Herpes");
		pb.setProcedure("Lobotomy");
		pb.setStatus("Success");
		pb.setCases(c);
		pb.setDoctor(d);
		pb = professionalBillRepository.save(pb);
	}
}