package com.esp.cdr.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity (name="cases")
public class Case {
	
	@Id
	@Column(name="case_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="case_unit_info")
	private String unitInfo;
	
	@Column(name="case_census_info")
	private String censusInfo;
	
	@Column(name="case_medication")
	private String medication;
	
	@Column(name="case_visitation_type")
	private String visitationType;
	
	@Column(name="case_insurance")
	private String insurance;
	
	@Column(name="case_costs")
	@NotNull
	private float costs;
	
	@Column(name="case_charges")
	@NotNull
	private float charges;
	
	@Column(name="case_reimbursement")
	@NotNull
	private float reimbursement;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@OneToMany(mappedBy="cases")
	private List<LabTest> labresult;
	
	@OneToMany(mappedBy="cases")
	private List<ProfessionalBill> pb;
	
	public int getId() {
		return id;
	}
	public void setId(int case_id) {
		this.id = case_id;
	}
	public String getUnitInfo() {
		return unitInfo;
	}
	public void setUnitInfo(String case_unit_info) {
		this.unitInfo = case_unit_info;
	}
	public String getCensusInfo() {
		return censusInfo;
	}
	public void setCensusInfo(String case_census_info) {
		this.censusInfo = case_census_info;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String case_medication) {
		this.medication = case_medication;
	}
	public String getVisitationType() {
		return visitationType;
	}
	public void setVisitationType(String case_visitation_type) {
		this.visitationType = case_visitation_type;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String case_insurance) {
		this.insurance = case_insurance;
	}
	public float getCosts() {
		return costs;
	}
	public void setCosts(float case_costs) {
		this.costs = case_costs;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float case_charges) {
		this.charges = case_charges;
	}
	public float getReimbursement() {
		return reimbursement;
	}
	public void setReimbursement(float case_reimbursement) {
		this.reimbursement = case_reimbursement;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public List<LabTest> getLabresult() {
		return labresult;
	}
	public void setLabresult(List<LabTest> labresult) {
		this.labresult = labresult;
	}
	public List<ProfessionalBill> getPb() {
		return pb;
	}
	public void setPb(List<ProfessionalBill> pb) {
		this.pb = pb;
	}
}