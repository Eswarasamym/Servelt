package com;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/validate")
public class vaildate extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usn=req.getParameter("username");
		String pwd=req.getParameter("userpassword");
		PrintWriter p=resp.getWriter();
		p.print("<html><body>");
		if(usn.equalsIgnoreCase("admin@gmail.com") && pwd.equals("Admin@123")) {
		p.print("<h1>Login success</h1>");
	}
		else {
			p.print("<h1>Login failure</h1>");
			p.print("<h1>Enter proper Credentails</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
}

 


