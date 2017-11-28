package co.edu.udea.classroom_udea_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="persons")
public class Persons {
	@Id
	private String id;
	private String name;
	private String email;
	private String person_id;
	
	public Persons(){}

	public String get_id() {
		return id;
	}

	public void set_id(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPerson_id() {
		return person_id;
	}

	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	
	
}
