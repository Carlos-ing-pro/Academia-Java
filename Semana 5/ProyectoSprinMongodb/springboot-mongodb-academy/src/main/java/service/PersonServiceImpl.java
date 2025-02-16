package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import collection.Person;
import repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	 private PersonRepository personRepository;
	
	 @Override
	 public String save(Person person) {
	 personRepository.save(person);
	 return person.getPersonId();
}
	 @Override
	  public List<Person> getPersonStartsWith(String
	 name) {
	  return
	 personRepository.findByFirstNameStartsWith(name);
	  }
	 
	  @Override
	  public void delete(String id) {
	  personRepository.deleteById(id);
	  }
	  // ... implementación adicional ...
	@Override
	public String serve(Person person) {
		// TODO Auto-generated method stub
		return null;
	}
	  }