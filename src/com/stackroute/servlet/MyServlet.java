package com.stackroute.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String msg = config.getInitParameter("password");
		String password=  config.getInitParameter("driver");
		System.out.println("msg from web.xml"+ msg + "    " + password );
		String gdata = config.getServletContext().getInitParameter("globaldriver");
		System.out.println("gdata" + gdata);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("In destroy");
	}

	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String name = request.getParameter("user");
//		
//		System.out.println("In service");
//		
//		PrintWriter pw = response.getWriter();
//		pw.println("In browser");
//		pw.println("name is" + name);
//		
//		
		
		
		
	//}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
String name = req.getParameter("user");
		req.setAttribute("name",name+"legend");
		System.out.println("In service");
		
		PrintWriter pw = resp.getWriter();
		pw.println("In browser");
		pw.println("name is" + name);
		RequestDispatcher rd = req.getRequestDispatcher("secondservlet");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
	PrintWriter pw =resp.getWriter();
	pw.println("hello from servlet");
	}

}
