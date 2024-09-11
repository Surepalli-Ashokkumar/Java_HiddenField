package com.cisco.hiddenfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Loginservlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	     PrintWriter pw = resp.getWriter();
	     resp.setContentType("text/html");
	     
	     String uname = req.getParameter("uname");
	     
	     pw.println("<form action='dashboard' method='post'>");
	     pw.println("'<input type='hidden' name='uname' value=' "+uname+"'>");
	     pw.println("<input type='submit' value='DashBoard'>");
	     pw.println("</form>");
	     
	     
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
	}
     
}  
