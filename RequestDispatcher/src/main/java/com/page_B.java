package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page-b")

public class page_B extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is page b");
		
		String kn=(String)req.getAttribute("kingname");
		String qn=(String)req.getAttribute("queenname");
		System.out.println(kn);
		System.out.println(qn);
		
		PrintWriter p=resp.getWriter();
		p.print("<html><body>");
		p.print("<h1>the king name is :"+kn+"</h1>");
		p.print("<h1>the queen  name is :"+qn+"</h1>");
		p.print("</html></body>");
		
		
	}
	

}
