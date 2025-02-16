package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	 @Autowired
	 private PersonService personService;
	
	 @PostMapping
	 public String save(@RequestBody Person person)
	{
	 return personService.save(person);
	 }
	
	 @GetMapping
	 public List<Person> getPersonStartsWith(@RequestParam String name) {
	 return personService.getPersonStartsWith(name);
	 }
	
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable String id) {
	 personService.delete(id);
	 }
	 
	 
}
