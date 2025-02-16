package service;

import java.util.List;


import collection.Person;

public interface PersonService {
	
	String serve(Person person);
	
	List<Person> getPersonStartsWith(String name);
	
	void delete(String id);


	
	

}
