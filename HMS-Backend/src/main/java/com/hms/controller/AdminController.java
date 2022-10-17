package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.Doctor;
import com.hms.model.Patient;
import com.hms.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping(value="admin")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	@PostMapping(value = "sd" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveDoctor(@RequestBody Doctor doctor) {
		return adminservice.saveDoctor(doctor);
	}
	@GetMapping(value="ld",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Doctor> ListDoctor() {
		return adminservice.listAllDoctors();	
	}
	@DeleteMapping(value="dd/{d_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteDoctor(@PathVariable("d_id") int d_id) {
		return adminservice.deleteDoctor(d_id);
	}
	@PatchMapping(value="ad/{d_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String approveDoctor(@PathVariable("d_id") int d_id) {
		return adminservice.approveDoctor(d_id);
	}
	@PatchMapping(value="rd/{d_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String rejectDoctor(@PathVariable("did") int did) {
		return adminservice.rejectDoctor(did);
	}
	@PostMapping(value = "sp" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public String savePatient(@RequestBody Patient patient) {
		return adminservice.savePatient(patient);
	}
	@PatchMapping(value="ap/{p_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String admitPatient(@PathVariable("p_id") int p_id) {
		return adminservice.admitPatient(p_id);
	}
	@GetMapping(value="lp",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Patient> ListPatient() {
		return adminservice.ListPatients();	
	}
	@PatchMapping(value="dp/{p_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String dischargePatient(@PathVariable("p_id") int p_id) {
		return adminservice.dischargePatient(p_id);
	}
	@PatchMapping(value="rp/{p_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String rejectPatient(@PathVariable("p_id") int p_id) {
		return adminservice.rejectPatient(p_id);
	}
//	@PatchMapping(value="appt",produces = MediaType.APPLICATION_JSON_VALUE)
//	public String appointPatient(@RequestBody Patient patient) {
//		return adminservice.appointPatient(patient);	
//	}
//	@PatchMapping(value="bpa",produces = MediaType.APPLICATION_JSON_VALUE)
//	public String bookPatient(@RequestBody Patient patient) {
//		return adminservice.bookPatient(patient);
//	}
//	@GetMapping(value="la",produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Patient> listAppointments() {
//		return adminservice.listAppointments();
//		
//	}
//	
}
