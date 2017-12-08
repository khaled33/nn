package com.exem.Dao;

import java.sql.*;

import com.exem.bdd.bdd;
import com.exem.beans.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class  UserDao implements Dao<User> {

	Connection connect =bdd.getInstance();
	public    User ajout(User obj) {
		Connection connect =bdd.getInstance();
		String query="INSERT INTO `user` (`Id_user`, `Nom_user`, `prenom_user`, `email_user`, `pass_user`, `image`, type_user)"
				+ " VALUES (NULL, ?, ?, ?, ?, NULL, NULL)";
		
		try {
			PreparedStatement  prepdStmt = (PreparedStatement) connect.prepareStatement(query);
			prepdStmt.setString(1, obj.getNom_user());
			prepdStmt.setString(2, obj.getPrenom_user());
			prepdStmt.setString(3, obj.getEmail_user());	
			prepdStmt.setString(4, obj.getPass_user());
			//prepdStmt.setString(5, obj.getType_user());
			
			prepdStmt.execute(); 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return obj;
		
		}
	
	public boolean virfConex(String pass ,String email ) {
		
		Connection connect =bdd.getInstance();
		
		boolean err=false;
		
		 try {
			 String	 query = "SELECT * FROM user Where email_user= ? && pass_user=? ";
			 PreparedStatement  prepdStmt = (PreparedStatement) connect.prepareStatement(query);
			 			prepdStmt.setString(1, email);
			 			prepdStmt.setString(2, pass);
			 			 ResultSet res = prepdStmt.executeQuery();
			 			boolean encore = res.next();
			 			
			 			err=encore;
			 
		    } catch (SQLException e ) {
		        
		    } 
	
		return err;
	}
	
	public User recherUser(String email){
		Connection connect =bdd.getInstance();
		User s= new User();
		String	 query = "SELECT *  FROM user Where email_user= ?  ";
		
		try{
		
		 PreparedStatement  prepdStmt = (PreparedStatement) connect.prepareStatement(query);
		 	prepdStmt.setString(1, email);
		 	ResultSet res = prepdStmt.executeQuery();
		 	while(res.next()){
		 		s.setId_user(res.getInt("Id_user"));
		 		s.setNom_user(res.getString("Nom_user"));
		 		s.setPrenom_user(res.getString("prenom_user"));
		 		s.setEmail_user(res.getString("email_user"));
		 		s.setPass_user(res.getString("pass_user"));
		 		s.setImage_user(res.getString("image"));
 		
		 	}
		 			 
		}catch (SQLException e) {
		}
		return s;
	}

	

}
