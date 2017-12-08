package com.exem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.exem.Dao.UserDao;
import com.exem.beans.User;

@WebServlet("/index")
public class index extends HttpServlet{
	private static final long serialVersionUID = 1L;

	 public index() {
	        super();
	      
	    }

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	response.sendRedirect( request.getContextPath()+"/WEBINF/connexion.jsp");
			 HttpSession session = request.getSession();
			 String n =(String) session.getAttribute("email");
			 User user =new User();
			 UserDao userDao=new UserDao();
			 
			   user = userDao.recherUser(n);
			   request.setAttribute("user", user);
			 
			
			 
			
			 this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward( request, response );

		}

		
		


		

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
		}


		

}
