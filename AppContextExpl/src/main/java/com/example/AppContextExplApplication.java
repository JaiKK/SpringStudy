package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppContextExplApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AppContextExplApplication.class, args);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans.xml" );
		MessageProvider mp = (MessageProvider) ctx.getBean("MsgProvider");
		mp.setMsg("Testing!!!");
		System.out.println( mp.getMsg() );

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello Command line...");
	}
}
