package dbservice;

import dbservice.datasets.UsersDataSet;

public interface DBService {
	UsersDataSet getUser(long id) throws DBException;
	
	long addUser(String name) throws DBException;
}
