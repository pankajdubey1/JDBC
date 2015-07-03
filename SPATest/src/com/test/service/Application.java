package com.test.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.dao.DAOLayer;
import com.test.dao.DBService;

public class Application {

	public static void main(String[] args) throws SQLException {
		DAOLayer ob=new DBService();
		String q="select * from user";
		ResultSet rs = ob.selectData(q);

		
		while(rs.next()){
			System.out.println(rs.getString("pass"));
		}
	}

}
