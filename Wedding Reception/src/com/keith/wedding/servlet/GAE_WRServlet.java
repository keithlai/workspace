package com.keith.wedding.servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GAE_WRServlet extends HttpServlet { 
public void doGet(HttpServletRequest req, HttpServletResponse 
resp)  throws IOException { 
	  PrintWriter out = resp.getWriter();
	  BufferedReader in = new BufferedReader(new FileReader("data/data.txt"));
	  String line;
	  while((line = in.readLine()) != null)
	  {
		  out.println(line);
	  }
	  in.close();
      out.close();
 } 
} 