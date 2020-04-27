package com.capgemini.tms.service;

import java.sql.SQLException;
import java.util.HashMap;
import com.capgemini.tms.dto.Admin;

public interface AdminService {
	public void showAllTest() throws SQLException;

	void SearchTest(int userId) throws SQLException;

//	boolean assignTest(Admin admin1) throws SQLException;

}
