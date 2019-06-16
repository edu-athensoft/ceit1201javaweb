package com.athensoft.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoWebInitParamServlet
 */
//@WebServlet("/demowebinitparam")

@WebServlet(
		name = "WebInitParamExample", urlPatterns = {"/demowebinitparam"}
		,initParams = {
		@WebInitParam(name= "Site :", value="http://athensoft.com"),
		@WebInitParam(name= "Course Code", value= "CEIT1201 Standard Java Web"),
		}
	)


public class DemoWebInitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoWebInitParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Init Param Servlet Example</h2>");
		ServletConfig config= getServletConfig();
		String pValue= config.getInitParameter("Site :");
		out.println("Param Value : "+pValue);
		String pValue1= config.getInitParameter("Course Code");
		out.println("<br>Param Value : "+pValue1);
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
