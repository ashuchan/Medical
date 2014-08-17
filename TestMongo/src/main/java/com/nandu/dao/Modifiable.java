package com.nandu.dao;

import com.nandu.model.DBService;

public interface Modifiable<T> {

	public int save(DBService _dbService);
	public boolean update(DBService _dbService);
	public boolean delete(DBService _dbService);
}
