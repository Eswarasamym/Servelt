package com.jsp.fiest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/apple")

public class demo extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("welcome to servlet code ");
		PrintWriter p= resp.getWriter();
		p.print("<html><body>");
		p.print("<h1>Hello everyone</h1>");
		p.print("</html></body>");
	}
	
}
/* Task 
 * 
 * 
 * 
 */
