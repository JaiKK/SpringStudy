package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class BeanLifeCycleApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(BeanLifeCycleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!!!");
		
		exit(0);
	}
}
