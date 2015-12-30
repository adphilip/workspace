package org.softcoaching.ro;

import javax.servlet.http.HttpServlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//http://localhost:8080/SimpleDynamicProject/XMLServletPath
public class XMLServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//request parameter
		//http://localhost:8080/SimpleDynamicProject/XMLServletPath?userName=Adrian
		String userName = request.getParameter("userName");
		out.println("<h3>Ce faci in do Get method din servlet via XML?</h3> <br> <h4>Ia ce fac de mult </h4> " + userName);
		
		//print in browser consoole
		System.out.println("Hi from doGet method in XML Servlet!, userName :" + userName);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//request parameter
		//http://localhost:8080/SimpleDynamicProject/XMLServletPath?userName=Adrian
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String profession = request.getParameter("profession");
		//String location = request.getParameter("location");
		String [] location = request.getParameterValues("location");
				
		//Print in web base
		out.println("<h3>Ce faci in do POST :</h3>  ");
		out.println("<p>User name: </p>  " + userName);
		out.println("<p>Full name: </p>  " + fullName);
		out.println("<p>You are a(n): </p>  " + profession);
		
		out.println("<p>You are in location:   " + location.length +"</p>");
	
		for (int i =0; i<location.length; i++){
			out.println("Place :" + location[i]);
		}
		
		
		
		
		//e afisat in consola
		System.out.println("Hi from doPost method in XML Servlet!, userName :" + userName + " full name :" + fullName);
	}

}
