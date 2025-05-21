package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pagea")

public class pageA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c=new Cookie("kingname","eswar");
		resp.addCookie(c);
		Cookie c1=new Cookie("queenname","pruma");
		resp.addCookie(c1);
		Cookie c2=new Cookie("pi","3.14");
		resp.addCookie(c2);
		System.out.println("cookie added to client machine");
	}

}
