package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")

public class login extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("useremail1");
		String password=req.getParameter("userpassword1");
		
		System.out.println("The user input email is:"+email);
		System.out.println("The user input password is is:"+password);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
String url="jdbc:mysql://localhost:3306/employee_servelt_jdbc_db";
			
			String user="root";
			String pass="root";
			Connection c=DriverManager.getConnection(url,user,pass);
			
			String query="select * from employee where email=? and password=?";
			
			PreparedStatement ps=c.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			PrintWriter p=resp.getWriter();
			
			if(rs.next()) {
				System.out.println("login succssfully");
			}else {
				System.out.println("failed");
			}
			rs.close();
			ps.close();
			c.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
