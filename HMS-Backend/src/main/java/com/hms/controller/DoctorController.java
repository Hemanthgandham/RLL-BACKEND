package com.hms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.Doctor;
import com.hms.model.Patient;
import com.hms.service.DoctorService;



@RestController
@RequestMapping(value ="doctor")
@CrossOrigin
public class DoctorController {
	@Autowired
	DoctorService docservice;
	
	@GetMapping(value="vp/{d_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Patient> listPatients(@PathVariable("d_id") int d_id) {
		return docservice.listPatients(d_id);
	}
	
	@GetMapping(value="vaa/{d_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Patient> listAppoinments(@PathVariable("d_id") int d_id) {
		return docservice.getAppointmentByid(d_id);
	}
	@PostMapping(value = "sd" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveDoctor(@RequestBody Doctor doctor) {
		return docservice.saveDoctors(doctor);
	}
	 
	@PatchMapping(value = "da",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String deleteAppointment(@RequestBody Patient patient) {
		return docservice.deleteAppointment(patient);
	}
	
	@GetMapping(value="vpd/{d_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Patient> getAllDischarged(@PathVariable("d_id") int d_id) {
		return docservice.dischargePatientByid(d_id);
	}

}