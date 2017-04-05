package com.proxybean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainJava {

	public static void main(String[] args) {

		Resource context = new ClassPathResource("bean.xml");
		
		BeanFactory factory = new XmlBeanFactory(context);
		
		AopExample a = factory.getBean("proxy",AopExample.class);
	
		a.show();
		
		
		
		
	}

}
