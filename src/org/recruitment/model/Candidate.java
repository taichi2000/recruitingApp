package org.recruitment.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Candidate {

	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	@Stereotype("EMAIL")
	private String email;
	
	@OneToMany(mappedBy="candidato")
	private List<Entrevista> entrevistas;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Entrevista> getEntrevistas() {
		return entrevistas;
	}

	public void setEntrevistas(List<Entrevista> entrevistas) {
		this.entrevistas = entrevistas;
	}

	public Integer getCantidadEntrevistas() {
		return entrevistas!=null?entrevistas.size():0;
	}
}
