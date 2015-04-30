package org.recruitment.model;

import javax.persistence.*;

@Entity
class Entrevista {

	@Id
	String id;
	
	Date fecha;
	
	String lugar;
	
	@ManyToOne
	Candidate candidato;
}
