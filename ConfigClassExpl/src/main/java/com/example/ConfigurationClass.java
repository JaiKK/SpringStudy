package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public MessageProvider msgProvider() {
		return new MessageProvider();
	}
}
