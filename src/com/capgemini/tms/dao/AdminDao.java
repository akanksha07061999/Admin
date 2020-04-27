package com.capgemini.tms.dao;

import java.sql.SQLException;
import java.util.HashMap;

import com.capgemini.tms.dto.Admin;

public interface AdminDao {

	HashMap<Integer, Admin> getallTest() throws SQLException;
	

	Admin SearchTest(int userId) throws SQLException;

	boolean assignTest(Admin admin1) throws SQLException;

}
