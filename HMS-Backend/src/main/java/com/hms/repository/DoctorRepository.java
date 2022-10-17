package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	Object getDoctorById(Integer dpid);



}
