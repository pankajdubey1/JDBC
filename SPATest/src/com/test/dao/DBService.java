package com.test.dao;

import java.sql.*;

public class  DBService implements DAOLayer
{
	public static Connection con;
	static
	{
		try
		{
		 Class.forName("com.mysql.jdbc.Driver");
		 String url = "jdbc:mysql://localhost:3306/SPATest";
		 String user = "root";
		 String pass = "123";
		 con = DriverManager.getConnection(url,user,pass);
		}catch(Exception e)
		{
			System.out.println("CONNECTION ERROR : "+e.getMessage());
		}
	}//END OF STATIC BLOCK

	public Connection getConnection()
	{
	 return con;
	}

	public PreparedStatement getPreparedStatement(String sql)
	{
	  try{	
	  PreparedStatement ps = con.prepareStatement(sql);
	  return ps;
	  }catch(Exception e)
	  {
		System.out.println("P Statement ERROR : "+e.getMessage());
		return null;
	  }
	}

	public ResultSet selectData(String selectQuery)
	{
		try{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(selectQuery);
			return rs;
		}catch(Exception e)
		{
		 System.out.println("SELECT ERROR : "+e.getMessage());
		 return null;
		}
	}

	public int updateData(String updateQuery)
	{
		try{
			Statement st = con.createStatement();
			int ur = st.executeUpdate(updateQuery);
			return ur;
		}catch(Exception e)
		{
		 System.out.println("UPDATE ERROR : "+e.getMessage());
		 return 0;
		}
	}

}
