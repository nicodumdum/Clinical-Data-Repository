package com.esp.cdr.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity (name="lab_test")
public class LabTest {
	
	@Id
	@Column(name="lab_test_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="lab_test_type")
	@NotNull
	private String testType;
	
	@Column(name="lab_test_date")
	@NotNull
	private String testDate;
	
	@Column(name="lab_test_conductor")
	@NotNull
	private String conductor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="case_id")
	private Case cases;
	
	public int getId() {
		return id;
	}
	public void setId(int lab_test_id) {
		this.id = lab_test_id;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String lab_test_type) {
		this.testType = lab_test_type;
	}
	public String getTestDate() {
		return testDate;
	}
	public void setTestDate(String lab_test_date) {
		this.testDate = lab_test_date;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String lab_test_conductor) {
		this.conductor = lab_test_conductor;
	}
	public Case getCases() {
		return cases;
	}
	public void setCases(Case cases) {
		this.cases = cases;
	}
}