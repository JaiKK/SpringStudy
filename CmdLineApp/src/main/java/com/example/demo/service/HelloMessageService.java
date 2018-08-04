package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {
	private String name;

	public String getName() {
		return "Hello... " + name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
