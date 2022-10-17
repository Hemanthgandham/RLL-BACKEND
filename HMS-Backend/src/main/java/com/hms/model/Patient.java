package com.hms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int p_id;
	private String firstname;
	private String lastname;
	private String emailId;
	private String password;
	private String p_status;
	private int age;
	private String gender;
	private String symptoms;
	private String address;
	private String phn_no;
	private Integer d_p_id;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
	
	public String getP_status() {
		return p_status;
	}
	public void setP_status(String d_status) {
		this.p_status = d_status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhn_no() {
		return phn_no;
	}
	public void setPhn_no(String phn_no) {
		this.phn_no = phn_no;
	}
	public Integer getD_p_id() {
		return d_p_id;
	}
	public void setD_p_id(Integer d_p_id) {
		this.d_p_id = d_p_id;
	}
	@Override
	public String toString() {
		return "Patient [p_id=" + p_id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailId=" + emailId
				+ ", password=" + password + ", p_status=" + p_status + ", age=" + age + ", gender=" + gender
				+ ", symptoms=" + symptoms + ", address=" + address + ", phn_no=" + phn_no + ", d_p_id=" + d_p_id + "]";
	}
	
	
	
}
