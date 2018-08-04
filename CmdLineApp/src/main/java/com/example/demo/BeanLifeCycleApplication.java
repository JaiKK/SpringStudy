package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.HelloMessageService;

import static java.lang.System.exit;

@SpringBootApplication
public class BeanLifeCycleApplication implements CommandLineRunner{

	@Autowired
	private HelloMessageService helloMessageService;
	
	public static void main(String[] args) {
		SpringApplication.run(BeanLifeCycleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		if( args.length > 0) {
			helloMessageService.setName(args[0].toString());
			System.out.println( helloMessageService.getName());						
		} else {
			System.out.println("Hello World!!!");			
		}
		
		exit(0);
	}
}
