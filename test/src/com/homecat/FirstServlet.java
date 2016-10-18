package com.homecat;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FirstServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://192.168.0.8:3306/test", "root", "123456");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			while (rs.next()){
				out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException se) {
			System.out.println("Db connection fail!");
			se.printStackTrace();
		}
		
	}
}
