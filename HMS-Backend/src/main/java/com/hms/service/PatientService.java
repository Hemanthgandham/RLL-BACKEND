package com.hms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.model.Patient;
import com.hms.repository.DoctorRepository;
import com.hms.repository.PatientRepository;


@Service
public class PatientService {
	@Autowired
	PatientRepository patrepo;
	@Autowired
	DoctorRepository docrepo;
	
	public String savePatient(Patient patient) {
		patrepo.save(patient);
		return "patient details saved successfully";
	}
	
	public String listDoctors(int p_id) {
		Optional<Patient> result = patrepo.findById(p_id);
		if(result.isPresent()) {
			Patient p = result.get();
			Integer dpid = p.getD_p_id();
			return docrepo.getDoctorById(dpid).toString();
			 
		}else {
			return "patient record not found";
		}
		
	}
	
	public String viewAppointmentStatus(int pid) {
		Optional<Patient> result = patrepo.findById(pid);
		if(result.isPresent()) {
			Patient p = result.get();
			return p.getP_status();
		}else {
			return "patient record not found";
		}
	}
		
	

}