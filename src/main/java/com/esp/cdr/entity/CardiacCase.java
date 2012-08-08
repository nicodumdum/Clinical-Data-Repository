package com.esp.cdr.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity (name="cardiac_case")
public class CardiacCase {

	@Id
	@Column(name="cardiac_case_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="cardiac_case_date")
	@NotNull
	private String date;

	@Column(name="cardiac_case_report")
	@NotNull
	private String caseReport;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patient;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

	public int getId() {
		return id;
	}
	public void setId(int cardiac_case_id) {
		this.id = cardiac_case_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String cardiac_case_date) {
		this.date = cardiac_case_date;
	}
	public String getCaseReport() {
		return caseReport;
	}
	public void setCaseReport(String cardiac_case_report) {
		this.caseReport = cardiac_case_report;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}