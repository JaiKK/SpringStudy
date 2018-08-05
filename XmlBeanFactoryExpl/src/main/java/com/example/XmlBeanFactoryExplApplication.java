package com.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class XmlBeanFactoryExplApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlBeanFactoryExplApplication.class, args);
		
		/**
		 * This method of creating beanfactory is depricated
		 */
		
		XmlBeanFactory xmlBF = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		
		MessageProvider mp = (MessageProvider) xmlBF.getBean("msgProvider");
		System.out.println( mp.getMsg() );
	}
}
