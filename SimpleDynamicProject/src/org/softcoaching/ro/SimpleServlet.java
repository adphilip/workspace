package org.softcoaching.ro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
//adnotarea /SimpleServletPath4 face sa avem request si response

//http://localhost:8080/SimpleDynamicProject/SimpleServletPath4
@WebServlet(description = "Simple Servlet playground.", urlPatterns = { "/SimpleServletPath4" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Date
		Date today = new java.util.Date();
		// For printing the info from JSP
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Ce faci in do Get method din servlet?</h3> <br> Afisat in index html with header 3");
		//print in console.
		System.out.println("Hi from doGet method!" + today);
	}

}
