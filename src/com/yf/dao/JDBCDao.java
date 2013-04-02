package com.yf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDao {
	public static void main(String args[]) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			 conn = DriverManager.getConnection("", "", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 try {
			ps=conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 try {
			ps.setString(1, "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
	}
}
