package com.exem.Dao;

import java.sql.*;

import com.exem.bdd.bdd;
import com.exem.beans.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserDao implements Dao<User> {

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

	

}
