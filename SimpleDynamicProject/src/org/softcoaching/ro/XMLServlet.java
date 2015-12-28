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
		
		
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Ce faci in do Get method din servlet via XML?</h3> <br> <h4>Ia ce fac de mult </h4> ");
		//e afisat in consola
		System.out.println("Hi from doGet method in XML Servlet!");
	}

}
