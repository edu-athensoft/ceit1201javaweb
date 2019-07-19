package com.athensoft.servlet.demo4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.athensedu.entity.demo4.User;

/**
 * Servlet implementation class DemoSessionSetter
 */
@WebServlet("/sessionsetter")
public class DemoSessionSetter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoSessionSetter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
<<<<<<< HEAD
		String data = "data-athensoft-session";//获取数据
	       
		HttpSession session = request.getSession();//获得session类实例，session类型是httpsession
=======
		String data = "data-athensoft-session";
		
		/*
		String userName = (String)request.getParameter("username");
		String password = (String)request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
	     //
		session.setAttribute("user", user);
		*/ 
		HttpSession session = request.getSession();
>>>>>>> refs/remotes/origin/dev-zq
		session.setAttribute("data", data);
				
		
		//forward to destination
		RequestDispatcher rd = request.getRequestDispatcher("UserProfile.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
