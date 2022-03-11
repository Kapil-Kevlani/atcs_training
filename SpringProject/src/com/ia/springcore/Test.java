package com.ia.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		//Employee emp = new Employee(123, "Adiyogi", 50000, "Banglore");
		Resource resource = new ClassPathResource("springConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp=(Employee) factory.getBean("awake");
		
		
		System.out.println(emp);
		
		
		
		 
	}
	

}
