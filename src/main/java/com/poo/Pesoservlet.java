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
public class Pesoservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) 
			throws ServletException, IOException {
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
	      String title = "Tu peso ideal";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      DBPeso mipeso = new DBPeso();
	      
	      float altura = Float.parseFloat(req.getParameter("altura"));
	      String sexo = req.getParameter("genero");
	      
	      
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	 
	               "<h1 align = \"center\"> Tu peso ideal es:</h1>" +
	               "<h2 align = \"center\">" + mipeso.PesoIdeal(altura, sexo)+ " kilos  </h2>\n" +
	            "</body> </html>"
	      );
		
		
	}
}
