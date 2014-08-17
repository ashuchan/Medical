package com.nandu.model;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.nandu.dao.Patient;

public class MongoDBService implements DBService {
	
	private String      connectionUrl;
	private String		dbName;
	private MongoClient mongo;
	private DB			mongoDb;
	
	public MongoDBService(String _connString, String _dbName) {
		this.connectionUrl = _connString;
		     this.dbName   = _dbName;
		
		establishConnection();
	}
	
	private void establishConnection(){
		try {
			mongo = new MongoClient(connectionUrl);
			mongoDb = mongo.getDB(dbName);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int addPatient(Patient _patient) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addPatients(List<Patient> _patients) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updatePatient(Patient _patient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePatient(Patient _patient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient getPatientById() {
		// TODO Auto-generated method stub
		return null;
	}

}
