package com.alac.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); 
		context.registerShutdownHook();
		Triangle triangle = (Triangle)context.getBean("triangle");
		System.out.println(triangle);
	}
}
