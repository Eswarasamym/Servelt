package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/result")

public class BMIResult extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double index=(Double)req.getAttribute("bmiresult");
	
	String message="";
	if(index<18) {
		message="under weight";
	}else if(index >=18 && index<=25) {
		message="Normal";
	}else if(index>=25 && index<=30) {
		message="over weight";
	}else {
		message="obese";
	}
		PrintWriter p=resp.getWriter();
		p.print("<html><body>");
		p.print("<h1>Result is :"+index+"which means your are :"+message+"</h1>");
		
	
	}
	

}
