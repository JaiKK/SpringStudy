package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ActorRepository extends CrudRepository<Actor, Integer> {
	
//	List<Actor> findbyName(String Name);

}
