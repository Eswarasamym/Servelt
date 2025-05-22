package com.jsp.fiest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reading")

public class read_by_form_task1 extends HttpServlet  {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("username");
		String email=req.getParameter("useremail");
		String city=req.getParameter("usercity");
		String phno=req.getParameter("userphno");
		
		System.out.println("user name is :"+name);
		System.out.println("user email is :"+email);
		System.out.println("user city is :"+city);
		System.out.println("user phone number is :"+phno);
	}

}
