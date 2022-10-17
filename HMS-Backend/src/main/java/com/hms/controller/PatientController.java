package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.Patient;
import com.hms.service.PatientService;


@RestController
@CrossOrigin
@RequestMapping(value="Patient")
public class PatientController {
	@Autowired
	PatientService patservice;
	
	@PostMapping(value = "sp" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public String savePatient(@RequestBody Patient patient) {
		return patservice.savePatient(patient);
	}
	
	@GetMapping(value="ld/{p_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String listDoctors(@PathVariable("pid") int p_id) {
		return patservice.listDoctors(p_id);
	}
	
	@GetMapping(value="vaps/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String viewAppointmentStatus(@PathVariable("p_id") int p_id) {
		return patservice.viewAppointmentStatus(p_id);
	}

}