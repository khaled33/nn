package com.exem.Dao;

import java.sql.SQLException;
import java.util.List;

import com.exem.bdd.bdd;
import com.exem.beans.rapport;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DaoRapImpli  implements DaoRap<rapport> {
	
	Connection connect =bdd.getInstance();
	@Override
	public rapport ajout(rapport obj) {
				
		String query="INSERT INTO `rapports` (`id_rapport`, `Id_user`,`titre_rapport`, `nom_etudi`, `prenom_etudiant`, `rapport`, `annee_rapport`,`branche_etudes`,`mention_rapport`,`description`)"
				+ " VALUES (NULL, ?, ?, ?, ?, ?, ?,?,?,?)";
		
		try {
			PreparedStatement  prepdStmt = (PreparedStatement) connect.prepareStatement(query);
			prepdStmt.setInt(1, obj.getId_user());
			prepdStmt.setString(2, obj.getTitre_rapport());
			prepdStmt.setString(3, obj.getNom_etudi());	
			prepdStmt.setString(4, obj.getPrenom_etudiant());
			prepdStmt.setString(5, obj.getRapport());
			prepdStmt.setString(6, obj.getAnnee_rapport());
			prepdStmt.setString(7, obj.getBranche_etudes());
			prepdStmt.setString(8, obj.getMention_rapport());
			prepdStmt.setString(9, obj.getDescription());
System.out.println("ok");
			
			prepdStmt.execute(); 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public rapport modifer (rapport obj) {
		// TODO Auto-generated method stub
		return obj;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<rapport> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public rapport recherche(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
