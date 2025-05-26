package com;
import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetch")
public class FetchAllData extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String url="jdbc:mysql://localhost:3306/employee_servelt_jdbc_db";
			String user="root";
			String pass="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url,user,pass);
			String query="select * from employee";
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery(query);
			
			req.setAttribute("employeeResultSet", rs);
			RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
			rd.forward(req, resp);
			c.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
