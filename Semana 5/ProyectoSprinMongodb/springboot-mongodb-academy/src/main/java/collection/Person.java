package collection;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Document(collection="person")
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Person {
	@Id
	private String personId;
	private String name;
	private String lastname;
	private Integer age;
	
	private List<String> hobbies;
	private List<Address> addresses;
	
	
	
	
}
