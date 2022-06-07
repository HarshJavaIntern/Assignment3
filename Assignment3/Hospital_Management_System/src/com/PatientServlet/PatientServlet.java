package com.PatientServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PatientServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email =	request.getParameter("Email");
		String pass = request.getParameter("password");
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		if(email.equals("harsh.nath@kelltontech.com") && pass.equals("harsh@123"))
		{
		
			response.sendRedirect("file1.html");
		}
		
		else if(email.equals("harsh.jha110043@gmail.com") && pass.equals("Harsh@123" )){
			

			response.sendRedirect("file1.html");

		}
		
		else {
			
			out.println("<h1> Either your Email or Password is wrong</h1> <a href='Home_page.html'><h2> Back to home</h2></a>");
		}
	}
	}
