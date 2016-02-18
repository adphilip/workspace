package org.softcoaching.ro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Date
		Date today = new java.util.Date();
		// Get from JSP
		System.out.println("I'm in GET! ");
		String idEmployee = request.getParameter("idemployee");
		PrintWriter out = response.getWriter();
		out.println ("Get IDEmployee:" + idEmployee + " today: " + today);
		System.out.println("Get IDEmployee:" + idEmployee + " today: " + today);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Date
		Date today = new java.util.Date();
		//
		System.out.println("I'm in POST! ");
		String nameIn = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.println ("POST name: " + nameIn + " today: " + today); 
		System.out.println("Get IDEmployee: " + nameIn + " today: " + today);
	}

}
