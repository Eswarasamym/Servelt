package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")

public class UpdateName extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("userid"));
		String name=req.getParameter("username");
		
		System.out.println("The id is :"+id);
		System.out.println("The name is :"+name);
		
		try {
          String url="jdbc:mysql://localhost:3306/employee_servelt_jdbc_db";
			
			String user="root";
			String pass="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url,user,pass);
			String query="update employee set name=? where id=?";
			
			PreparedStatement ps=c.prepareStatement(query);
			
			ps.setInt(2, id);
			ps.setString(1, name);
			
			ps.execute();
			System.out.println("Data updated");
			
			c.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
