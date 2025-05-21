package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/calculate")

public class calculateBMI extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String height=req.getParameter("userheight");
		String weight=req.getParameter("userweight");
		
		double h=Double.parseDouble(height);
		double w=Double.parseDouble(weight);
		
		double result=w/(h*h);
		
		req.setAttribute("bmiresult", result);
		
		RequestDispatcher rd=req.getRequestDispatcher("result");
		rd.forward(req, resp);
		
	}

}
