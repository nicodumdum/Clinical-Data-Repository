package com.esp.cdr.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity (name="professional_bill")
public class ProfessionalBill {
	
	@Id
	@Column(name="pb_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="pb_date")
	@NotNull
	private String date;
	
	@Column(name="pb_diagnoses")
	@NotNull
	private String diagnoses;
	
	@Column(name="pb_procedure")
	@NotNull
	private String procedure;
	
	@Column(name="pb_status")
	@NotNull
	private String status;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="case_id")
	private Case cases;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doctor_id")
	private Doctor doctor;
	
	public int getId() {
		return id;
	}
	public void setId(int pb_id) {
		this.id = pb_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String pb_date) {
		this.date = pb_date;
	}
	public String getDiagnoses() {
		return diagnoses;
	}
	public void setDiagnoses(String pb_diagnoses) {
		this.diagnoses = pb_diagnoses;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String pb_procedure) {
		this.procedure = pb_procedure;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String pb_status) {
		this.status = pb_status;
	}
	public Case getCases() {
		return cases;
	}
	public void setCases(Case cases) {
		this.cases = cases;
	}	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}