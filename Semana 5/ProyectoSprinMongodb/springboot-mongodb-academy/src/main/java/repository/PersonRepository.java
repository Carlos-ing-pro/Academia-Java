package repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import collection.Person;
@Repository
public interface PersonRepository  extends MongoRepository<Person, String>{
List<Person> findByFirstNameStartsWith(String name);
}
