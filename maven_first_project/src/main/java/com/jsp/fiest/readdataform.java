package com.jsp.fiest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/read")

public class readdataform extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//read a user form
		// use the get parameter 
		
		String name=req.getParameter("username");
		String age=req.getParameter("userage");
		String email=req.getParameter("useremail");
		String phno=req.getParameter("userphno");
		
		System.out.println("name is:"+name);
		System.out.println("Age is :"+age);
		System.out.println("email is :"+email);
		System.out.println("Phone number is :"+phno);
	}

}
