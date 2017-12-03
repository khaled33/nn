package com.exem.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exem.Dao.UserDao;
import com.exem.beans.User;


@WebServlet("/inscription")
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //private UserDao UserDao;   
    
    public inscription() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	response.sendRedirect( request.getContextPath()+"/WEBINF/connexion.jsp");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		
		user.setNom_user(request.getParameter("nom"));
		user.setPrenom_user(request.getParameter("prnom"));
		user.setPass_user(request.getParameter("pass"));
		user.setEmail_user(request.getParameter("email"));
		UserDao UserDao = new  UserDao();
		UserDao.ajout(user);
	}

}
