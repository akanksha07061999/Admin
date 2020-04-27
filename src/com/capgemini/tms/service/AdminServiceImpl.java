package com.capgemini.tms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.Util.AdminDatabaseUtil;
import com.capgemini.tms.dao.AdminDao;
import com.capgemini.tms.dao.AdminDaoImpl;
import com.capgemini.tms.dto.Admin;

public class AdminServiceImpl implements AdminService {
	
	Connection connection;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	
	AdminDao adminDao;
	HashMap<Integer, Admin> hashMap;
	Admin admin = null;
	Scanner sc = new Scanner(System.in);

	int testId;
	String userId;

	public AdminServiceImpl() throws SQLException {
		adminDao = new AdminDaoImpl();
		connection=AdminDatabaseUtil.myconnection();
	}

	@Override
	public void showAllTest() throws SQLException {
		hashMap = adminDao.getallTest();

		Set<Integer> keyset = hashMap.keySet();
		for (Integer integer : keyset) {
			System.out.println(hashMap.get(integer));
		}

	}
	
	@Override
	public void SearchTest(int userId) throws SQLException {
		if(connection==null)
			System.out.println("null");
		pst = connection.prepareStatement("select testId from admin where userId=?");
		pst.setInt(1, userId);
		rs = null;
		rs = pst.executeQuery();
		if (rs.next()) {
			admin = null;
			admin = new Admin();

			admin.setTestId(rs.getInt(1));
			

		}
		if(admin==null)
			System.out.println("not found");
		else System.out.println("found at" +admin);
	}

	/*@Override
	public boolean assignTest(Admin admin1) throws SQLException {
		admin = SearchTest((int) admin1.getuserId());
		if (admin == null) {
			pst = null;
			pst = connection.prepareStatement("insert into admin values(?,?)");
			pst.setInt(1, (int) admin1.getuserId());
			pst.setInt(2, admin1.getTestId());

			int res = pst.executeUpdate();
			if (res == 1)
				return true;
			else
				return false;
		}
		return false;
	}*/


}
