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
@WebServlet("/home")

public class HomePage extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p=resp.getWriter();
		String user=req.getParameter("username");
		String password=req.getParameter("userpassword");
		
		if("admin".equals(user) && "admin1234".equals(password)) {
			p.print("<html><body>");
			p.print("<h1>Welcome to home page</h1>");
			p.print("</html></body>");
			System.out.println("Welcome to home page");
			HttpSession hs=req.getSession();
			hs.setAttribute("username", user);
			hs.setAttribute("userpassword", password);
		}else {
			System.out.println("Login first");
			RequestDispatcher rd=req.getRequestDispatcher("login1.html");
			rd.forward(req, resp);
		}
	}

}
