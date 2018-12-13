package com.pg.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageTestServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		int age=Integer.parseInt(request.getParameter("age"));
		String name=request.getParameter("name");
		String photo=request.getParameter("photo");
		
		//business logic 
		if(age<18) {
			
			pw.println("<h1 style='color:red;text-align:center' >Sorry "+name+"!</br> You are not eligible for marriage.....Enjoy your bachelor life!</h1>");
		}
		 else if(age<50) {
			pw.println("<h1 style='color:green;text-align:center'>Hip Hip Hurre.... "+name+"!</br> You are eligible for Marriage.....Enjoy your life with lifePartner!</h1>");
		}
		else  {
			pw.println("<h1 style='color:orange;text-align:center'>Sorry "+name+"!</br> You are too old to for getting Marriage!</h1>");
		}
		
		pw.println("<a href='input.html'>Home</a>");
		
		
	}
		
	}
