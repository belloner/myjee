package com.sinotrans.myjee.servelt;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(MyServlet.class); 
	private static Log comlog = LogFactory.getLog(MyServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   log.debug("How are you today?");
	    log.info("I am fine.");
	    log.error("I am programming.");
	   log.warn("I love programming.");
	    log.fatal("I am now dead. I should have been a movie star.");  
	    comlog();
		PrintWriter writer = response.getWriter();  
	       writer.print("Hello World Servlet!"); 
	}
   
   public void comlog(){
       comlog.debug("Debug comlog.");
       comlog.info("Info comlog");
       comlog.warn("Warn comlog");
       comlog.error("Error comlog");
       comlog.fatal("Fatal comlog");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}



}
