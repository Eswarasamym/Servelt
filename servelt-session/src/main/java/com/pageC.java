package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pagec")

public class pageC extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie [] ar=req.getCookies();
		for(Cookie c:ar) {
			if(c.getName().equalsIgnoreCase("pi")) {
			c.setMaxAge(0);
			resp.addCookie(c);
			System.out.println("Cookie delected");
		}
	}

}
}
