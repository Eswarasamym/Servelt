package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/regester")

public class regester extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("userid"));
		String name=req.getParameter("username");
		String email=req.getParameter("useremail");
		String password=req.getParameter("userpassword");
		double salary=Double.parseDouble(req.getParameter("usersalary"));
		System.out.println("The user input id is:"+id);
		System.out.println("The user input name is:"+name);
		System.out.println("The user input email is:"+email);
		System.out.println("The user input password is is:"+password);
		System.out.println("The user input salary  is:"+salary);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/employee_servelt_jdbc_db";
			
			String user="root";
			String pass="root";
			Connection c=DriverManager.getConnection(url,user,pass);
			
			String query = "INSERT INTO employee(id,name,email,password,salary) values(?, ?, ?, ?, ?)";
			PreparedStatement ps = c.prepareStatement(query);

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setDouble(5, salary);
			
			int result=ps.executeUpdate();
			PrintWriter p=resp.getWriter();
			
			if(result>0) {
				System.out.println("regestrion sucessfully");
			}else {
				System.out.println("not successfull");
			}
			
			c.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
