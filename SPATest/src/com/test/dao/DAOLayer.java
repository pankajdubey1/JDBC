package com.test.dao;

import java.sql.*;

public interface DAOLayer
{
	public abstract Connection getConnection();

	public abstract PreparedStatement getPreparedStatement(String sql);

	public abstract ResultSet selectData(String selectQuery);

	public abstract int updateData(String updateQuery);
}

