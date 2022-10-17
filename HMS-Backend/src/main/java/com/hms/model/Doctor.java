package com.hms.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int d_id;
	private String firstname;
	private String lastname;
	private String emailId;
	private String password;
	private String d_status;
	private String specialization;
	private String phn_no;
	private String address;
	private String expericence;
	private String expected_salary;
	@OneToMany
	@JoinColumn(name="dpid")
	private List<Patient> listOfpat;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getD_status() {
		return d_status;
	}
	public void setD_status(String p_status) {
		this.d_status = p_status;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getPhn_no() {
		return phn_no;
	}
	public void setPhn_no(String phn_no) {
		this.phn_no = phn_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExpericence() {
		return expericence;
	}
	public void setExpericence(String expericence) {
		this.expericence = expericence;
	}
	public String getExpected_salary() {
		return expected_salary;
	}
	public void setExpected_salary(String expected_salary) {
		this.expected_salary = expected_salary;
	}
	public List<Patient> getListOfpat() {
		return listOfpat;
	}
	public void setListOfpat(List<Patient> listOfpat) {
		this.listOfpat = listOfpat;
	}
	@Override
	public String toString() {
		return "Doctor [d_id=" + d_id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailId=" + emailId
				+ ", password=" + password + ", d_status=" + d_status + ", specialization=" + specialization
				+ ", phn_no=" + phn_no + ", address=" + address + ", expericence=" + expericence + ", expected_salary="
				+ expected_salary + ", listOfpat=" + listOfpat + "]";
	}
	
	
	
}
