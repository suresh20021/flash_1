package com.durgasoft.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcType1 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st= null;
		try {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:suresh","dinesh1035","welcome");
		st = con.createStatement();																											
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter table name  :");
		String tname = br.readLine();

		String sql = "Create table "+tname+"(eno number,ename varchar(20),esal number)";

		st.executeUpdate(sql);

		System.out.println("Table created Successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();		
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

        

	}

}
