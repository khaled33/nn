package com.exem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.exem.Dao.DaoRapImpli;
import com.exem.beans.rapport;

@WebServlet("/parametre")
public class parametre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/parametre.jsp").forward( request, response );
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session = request.getSession();
		//int id_user=(Integer) session.getAttribute("user");
		int id_user=12;
		
		rapport rap = new rapport();
			rap.setId_user(id_user);
			rap.setNom_etudi(request.getParameter("nom"));
			rap.setPrenom_etudiant(request.getParameter("prnom"));
			rap.setTitre_rapport(request.getParameter("titre"));
			rap.setBranche_etudes(request.getParameter("branche"));
			rap.setMention_rapport(request.getParameter("montion"));
			rap.setAnnee_rapport(request.getParameter("annee"));
			rap.setDescription(request.getParameter("desc"));
			rap.setRapport(request.getParameter("file"));
			
		DaoRapImpli daoRapImpli= new DaoRapImpli();
		
		daoRapImpli.ajout(rap);
		

System.out.println(request.getParameter("nom"));

		this.getServletContext().getRequestDispatcher("/WEB-INF/parametre.jsp").forward( request, response );


		
	}
}
