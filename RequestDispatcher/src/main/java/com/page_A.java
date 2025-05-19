package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page-A")

public class page_A extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This a page A");
		
		//   key and value 
		req.setAttribute("kingname","smith");
		req.setAttribute("queenname", "rose");
		
		RequestDispatcher rd=req.getRequestDispatcher("page-b");
		rd.forward(req, resp);
		
		
		
		
	}

}
