package org.recruitment.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Entrevista {

	@Id
	private String id;
	
	private Date fecha;
	
	private String lugar;
	
	@ManyToOne
	private Candidate candidato;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Candidate getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidate candidato) {
		this.candidato = candidato;
	}
}
