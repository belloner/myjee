package com.jamesfen.myjee.aop.annotation;
import org.junit.Test;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void testSpringInterceptor() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		PersonService personService = (PersonService) ctx
				.getBean("personService");
		personService.getNameById(1l);
		System.out.println("----------------------------------");
		personService.save("csy");
	}
}
