package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	List<Patient> listAppointments();

	List<Patient> findByDpid(int d_id);

	List<Patient> getappoinmentsByid(int d_id);

	List<Patient> dischargePatientByid(int d_id);

	

}
