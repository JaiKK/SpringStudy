package com.example;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class BeanFactoryExplApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanFactoryExplApplication.class, args);
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("bean.xml"));
		
		MessageProvider mp = (MessageProvider) factory.getBean("msgProvider");
		System.out.println( mp.getMsg() );
		
	}
}
