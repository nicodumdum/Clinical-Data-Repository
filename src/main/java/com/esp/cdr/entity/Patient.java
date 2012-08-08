package com.esp.cdr.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity (name="patient")
public class Patient {

	@Id
	@Column(name="patient_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="patient_name")
	@NotNull
	private String name;

	@Column(name="patient_address")
	@NotNull
	private String address;

	@Column(name="patient_contact_number")
	@NotNull
	private String contactNumber;

	@Column(name="patient_gender")
	@NotNull
	private String gender;

	@Column(name="patient_birthdate")
	private String birthdate;

	@OneToMany(mappedBy="patient")
	private List<CardiacCase> cc;

	@OneToMany(mappedBy="patient")
	private List<Case> cases;

	public int getId() {
		return id;
	}
	public void setId(Integer patient_id) {
		this.id = patient_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String patient_name) {
		this.name = patient_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String patient_address) {
		this.address = patient_address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String patient_contact_number) {
		this.contactNumber = patient_contact_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String patient_gender) {
		this.gender = patient_gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String patient_birthdate) {
		this.birthdate = patient_birthdate;
	}
	public List<CardiacCase> getCc() {
		return cc;
	}
	public void setCc(List<CardiacCase> cc) {
		this.cc = cc;
	}
	public List<Case> getCases() {
		return cases;
	}
	public void setCases(List<Case> cases) {
		this.cases = cases;
	}
}