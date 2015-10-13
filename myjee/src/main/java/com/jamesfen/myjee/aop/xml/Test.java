package com.jamesfen.myjee.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	/**
	     * @param args
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	      ApplicationContext ctx = 
	          new FileSystemXmlApplicationContext("/src/main/java/applicationContext.xml");
	      
	      IStudent person = (IStudent)ctx.getBean("student");
	      person.addStudent("james");
	      person.removeStudent("yuli");
	      //person.addStudent("bill");
	    }
}
