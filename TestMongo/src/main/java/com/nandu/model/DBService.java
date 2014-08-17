package com.nandu.model;

import java.util.List;

import com.nandu.dao.Patient;

public interface DBService {

	public int addPatient(Patient _patient);
	public int addPatients(List<Patient> _patients);
	public boolean updatePatient(Patient _patient);
	public boolean deletePatient(Patient _patient);
	public Patient getPatientById();
}
