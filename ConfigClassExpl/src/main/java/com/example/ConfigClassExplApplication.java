package com.example;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class ConfigClassExplApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClassExplApplication.class, args);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		MessageProvider mp = (MessageProvider) ctx.getBean("msgProvider");
		mp.setMsg("Testing!!!");
		System.out.println( mp.getMsg() );		
	}
}
