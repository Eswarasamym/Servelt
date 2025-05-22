package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/validate")

public class Validate extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String user=req.getParameter("username");
		String password=req.getParameter("userpassword");
		if("admin".equals(user) && "admin123".equals(password)) {
			System.out.println("Login success");
			
			HttpSession hs=req.getSession();
			hs.setAttribute("username", user);
			hs.setAttribute("userpassword", password);
		}else {
			System.out.println("Login Failed");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, resp);
			
		}
	}

}
