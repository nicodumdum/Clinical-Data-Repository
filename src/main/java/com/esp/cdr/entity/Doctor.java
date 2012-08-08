package com.esp.cdr.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity (name="doctor")
public class Doctor {
	
	@Id
	@Column(name="doctor_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="doctor_name")
	@NotNull
	private String name;

	@Column(name="doctor_address")
	@NotNull
	private String address;

	@Column(name="doctor_contact_number")
	@NotNull
	private String contactNumber;

	@Column(name="doctor_gender")
	@NotNull
	private String gender;
	
	@Column(name="doctor_birthdate")
	private String birthdate;
	
	@Column(name="doctor_specialty")
	private String specialty;

	@OneToMany(mappedBy="doctor")
	private List<CardiacCase> cc;
	
	@OneToMany(mappedBy="doctor")
	private List<ProfessionalBill> pb;
	
	public int getId() {
		return id;
	}
	public void setId(int doctor_id) {
		this.id = doctor_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String doctor_name) {
		this.name = doctor_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String doctor_address) {
		this.address = doctor_address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String doctor_contact_number) {
		this.contactNumber = doctor_contact_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String doctor_gender) {
		this.gender = doctor_gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String doctor_birthdate) {
		this.birthdate = doctor_birthdate;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String doctor_specialty) {
		this.specialty = doctor_specialty;
	}
	public List<CardiacCase> getCc() {
		return cc;
	}
	public void setCc(List<CardiacCase> cc) {
		this.cc = cc;
	}
	public List<ProfessionalBill> getPb() {
		return pb;
	}
	public void setPb(List<ProfessionalBill> pb) {
		this.pb = pb;
	}
}