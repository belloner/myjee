package com.jamesfen.myjee.aop.xml2;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopTest {
	static ApplicationContext ctx;
	     static {                                      
	         ctx = new FileSystemXmlApplicationContext("/src/main/java/applicationContext.xml");
	         //ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	     }
	     
	     @Test
	     public void calculateTest(){
	         ICalculate cal =  (ICalculate) ctx.getBean("calculate");
	         int result =  cal.add(5, 6);
	         Assert.assertEquals(11, result);
	     }
}
