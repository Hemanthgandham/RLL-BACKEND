package com.hms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.model.Doctor;
import com.hms.model.Patient;
import com.hms.repository.DoctorRepository;
import com.hms.repository.PatientRepository;


@Service
public class DoctorService {
	@Autowired
	DoctorRepository docrepo;
	@Autowired
	PatientRepository patrepo;
	
	public String saveDoctors(Doctor doctor) {
		docrepo.save(doctor);
		return "doctor details saved successfully";
	}
	
	public List<Patient> listPatients(int d_id) {
		List<Patient> result = patrepo.findByDpid(d_id);
		return result;
	}
	
	public List<Patient> getAppointmentByid(int d_id) {
		return patrepo.getappoinmentsByid(d_id);
	}
	
	public String deleteAppointment(Patient patient) {
		
	Optional<Patient> result  = patrepo.findById(patient.getP_id());
	if(result.isPresent()) {
		Patient p = result.get();
		patient.setP_status("consulted");
		patrepo.saveAndFlush(p);
		return "patient record deleted";
	
	}else {
		return "patient not found";
	}
	}
	
	public List<Patient> dischargePatientByid(int d_id) {
		
		return patrepo.dischargePatientByid(d_id);
	}
}