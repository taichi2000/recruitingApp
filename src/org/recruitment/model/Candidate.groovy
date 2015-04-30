package org.recruitment.model;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
class Candidate {

	@Id
	String id
	
	String fullName
	
	Integer yearsOfExperience
	
	@Enumerated
	AppliedPosition positionAppliedFor
	
	@Enumerated
	InterviewProcessStatus status
	
	Boolean joinedTheCompany
	
	@Stereotype("EMAIL")
	String email
	
	@OneToMany(mappedBy="candidato")
	List<Entrevista> entrevistas
	
	Integer getCantidadEntrevistas() {
		entrevistas?.size() ?: 0
	}
}
