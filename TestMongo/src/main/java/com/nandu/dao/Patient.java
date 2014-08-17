package com.nandu.dao;

import javax.inject.Inject;

import com.nandu.model.DBService;

public class Patient implements Modifiable<Patient> {

	private Person personalDetails;
	
	public Person getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(Person personalDetails) {
		this.personalDetails = personalDetails;
	}

	@Inject
	@Override
	public int save(DBService _dbService) {
		// TODO Auto-generated method stub
		return _dbService.addPatient(this);
	}

	@Inject
	@Override
	public boolean update(DBService _dbService) {
		// TODO Auto-generated method stub
		return _dbService.updatePatient(this);
	}

	@Inject
	@Override
	public boolean delete(DBService _dbService) {
		// TODO Auto-generated method stub
		return _dbService.deletePatient(this);
	}

	@Inject
	public static Patient getById(DBService _dbService) {
		// TODO Auto-generated method stub
		return _dbService.getPatientById();
	}

}
