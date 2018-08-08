package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ActorController {

	public static final Logger log = LoggerFactory.getLogger(ApplicationContext.class);
	
	@Autowired
	private ActorRepository userRep;
	
	public void saveUser(Actor u) {
		userRep.save(u);
//		return userRep.count() + " record saved... successfully";
		log.info(" record saved... successfully");
	}
	
	public Iterable<Actor> findAll() {
		return userRep.findAll();
	}
}
