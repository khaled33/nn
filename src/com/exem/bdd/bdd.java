package com.exem.bdd;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class bdd {
	private static String url ="jdbc:mysql://localhost/mapfe";
	private static String user = "root";
	private static String passwd = "";
	private static Connection connect;
	
	public static Connection getInstance(){
		if(connect == null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("worked");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				
				connect=(Connection) DriverManager.getConnection(url,user,passwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connect;
		}
	
	
	
	}

