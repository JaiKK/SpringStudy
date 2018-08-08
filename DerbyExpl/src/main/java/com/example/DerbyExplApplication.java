package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DerbyExplApplication {

	public static final Logger log = LoggerFactory.getLogger(ApplicationContext.class);

	// @Autowired
	// private ActorController userCon = new ActorController();

	public static void main(String[] args) {
		SpringApplication.run(DerbyExplApplication.class, args);

		// userCon.saveUser(new Actor("Jai"));
		//
		// for (Actor u : userCon.findAll()) {
		// System.out.println(u.toString());
		// }

	}

	@Bean
	public CommandLineRunner demo(ActorRepository userRep) {
		return (args) -> {
			System.out.println("Testing");
			userRep.save(new Actor("Jai"));

			for (Actor u : userRep.findAll()) {
				System.out.println(u.toString());
			}

		};
	}

}
