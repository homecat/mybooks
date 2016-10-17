package com.homecat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

class Hello {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://192.168.0.8:3306/test", "root", "123456");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			while (rs.next()) {
				System.out.println(rs.getString(1) +"\t"+ rs.getString(2)
						+"\t"+ rs.getString(3));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
		}
	}
}



