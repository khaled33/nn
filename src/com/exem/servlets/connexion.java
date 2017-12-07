package com.exem.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exem.Dao.UserDao;


@WebServlet("/connexion")
public class connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg="salut user";
		request.setAttribute("msg", msg);
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email= request.getParameter("email");
		String pass= request.getParameter("pass");
		
		UserDao UserDao = new UserDao();
		
		boolean m =UserDao.virfConex(pass, email);
		
		if(m==true){
			response.sendRedirect( request.getContextPath()+"/WEBINF/index.jsp");
		}
		else{
			
		}

		// TODO Auto-generated method stub
	}

}
