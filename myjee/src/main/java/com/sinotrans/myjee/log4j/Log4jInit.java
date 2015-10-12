package com.sinotrans.myjee.log4j;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.PropertyConfigurator;

public class Log4jInit extends HttpServlet {
	@Override
	public void init()
    {
        String filePath = getInitParameter("log4j");
        String prefix =  getServletContext().getRealPath("/");
        System.out.println("日志的配置文件路径为："+filePath);
        if(filePath != null)
        {
            PropertyConfigurator.configure(prefix+filePath);  //载入配置文件
            System.out.println("日志的配置文件读取成功");
             
        }
    }
	 @Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
			   throws ServletException, IOException {
		 String filePath = getInitParameter("log4j");
	        System.out.println("日志的配置文件路径为："+filePath);
	        if(filePath != null)
	        {
	            PropertyConfigurator.configure(filePath);  //载入配置文件
	            System.out.println("日志的配置文件读取成功");
	             
	        }
	        
	        
	        
			PrintWriter writer = response.getWriter();  
		       writer.print("Hello World Servlet!"); 
   }
}
