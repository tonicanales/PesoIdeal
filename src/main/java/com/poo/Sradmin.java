package com.poo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SRAdmin
 */
public class Sradmin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) 
			throws ServletException, IOException {
	
		// Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String title = "Admin";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      DBAdmin nuevaAdmin = new DBAdmin();
	      
	      HashSet<Admin> admin2 = nuevaAdmin.findAllAdmin();
	     
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<table>");
	     			for (Admin a : admin2){
	      	            	 out.println(docType + 
	      	            			 "<tr><td>" + a.getName() +
	      	            			 "</td><td>" + a.getId() +
	      	            			 "</td></tr>");
	     			}
	     			
	     	out.println(docType +
	     			"</tr></table></body> </html>"
	      );
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
	      String title = "Bienvenido";
	      Date date = new Date();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      String name = req.getParameter("first_name"); 
	      String surname = req.getParameter("last_name"); 
	      
	      String fullName = name + " " + surname; 
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	 
	               "<h1 align = \"center\"> Bienvenido Mr: " + fullName  + "</h1>\n" +
	               "<h2 align = \"center\">" + date.toString() + "</h2>\n" +
	            "</body> </html>"
	      );
		
		
	}
}
