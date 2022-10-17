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
public class AdminService {

	@Autowired
	PatientRepository patrepo;
	DoctorRepository docrepo;
	
	public String saveDoctor(Doctor doctor) {
		docrepo.save(doctor);
		return "doctor details saved successfully";
	}

	public List<Doctor> listAllDoctors() {
		return docrepo.findAll();
	}

	public String deleteDoctor(int d_id) {
		Optional<Doctor> result = docrepo.findById(d_id);
		if(result.isPresent()) {
			Doctor d = result.get();
			docrepo.delete(d);
		return " Doctor record is deleted";
		}else {
			return "Doctor record not found";
		}
	}

	public String approveDoctor(int d_id) {
		Optional<Doctor> result = docrepo.findById(d_id);
		if(result.isPresent()) {
			Doctor d =result.get();
			d.setD_status("approved");
			docrepo.saveAndFlush(d);
			return "Doctor application is approved successfully";
			
		}else {
			return "Doctor record not found";			
		}
	}

	public String rejectDoctor(int d_id) {
		Optional<Doctor> result = docrepo.findById(d_id);
		if(result.isPresent()) {
			Doctor d =result.get();
			d.setD_status("rejected");
			docrepo.saveAndFlush(d);
			return "Doctor application is rejected";
			
		}else {
			return "Doctor record not found";
			
		}
	}

	public String savePatient(Patient patient) {
		patrepo.save(patient);
		return "patient details saved successfully";
	}

	public String admitPatient(int p_id) {
		Optional<Patient> result = patrepo.findById(p_id);
		if(result.isPresent()) {
			Patient p =result.get();
			p.setP_status("admitted");
			patrepo.saveAndFlush(p);
			return "patient admitted is successful";
			
		}else {
			return "patient record not found";
			
		}
	}
	public List<Patient> ListPatients() {
		return patrepo.findAll();
	}

	public String dischargePatient(int p_id) {
		Optional<Patient> result = patrepo.findById(p_id);
		if(result.isPresent()) {
			Patient p = result.get();
			p.setP_status("discharged");
			patrepo.saveAndFlush(p);
			
		return "patient is discharged";
		}else {
			return "patient record not found";
		}
	}

	public String rejectPatient(int p_id) {
		Optional<Patient> result = patrepo.findById(p_id);
		if(result.isPresent()) {
			Patient p =result.get();
			p.setP_status("rejected");
			patrepo.saveAndFlush(p);
			return "patient appointment is rejected";
			
		}else {
			return "patient record not found";
			
		}
	}
	
//	public String appointPatient(Patient patient) {
//		Optional<Patient> result = patrepo.findById(patient.getP_id());
//		if(result.isPresent()) {
//			Patient p =result.get();
//			p.setD_p_id(patient.getD_p_id());
//			p.setP_status("appointed");
//			patrepo.saveAndFlush(p);
//			return "patient appointed is successfully";
//			
//		}else {
//			return "patient record not found";
//			
//		}
//	}
//	
//	
//	public List<Patient> listAppointments() {
//		return patrepo.listAppointments();
//		
//	}
//	
//	public String bookPatient(Patient patient) {
//		Optional<Patient> result = patrepo.findById(patient.getP_id());
//		if(result.isPresent()) {
//			Patient p =result.get();
//			p.setD_p_id(patient.getD_p_id());
//			p.setP_status("appointed");
//			patrepo.saveAndFlush(p);
//			return "patient appointed is successfully";
//			
//		}else {
//			return "patient record not found";
//			
//		}
//	}

}



	




	

