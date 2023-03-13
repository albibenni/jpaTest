package com.agap2.restful.webservices.teamleasing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ruoli", schema = "dbo")
public class Ruoli {

	public Ruoli() {
		super();
	}

	@Id
	private int ruoloID;

	private String descrizione;
	/*
	@OneToOne(mappedBy = "ruolo")
	private AppUser appUser;
	*/
	
	public int getRuoloID() {
		return ruoloID;
	}

	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public String toString() {
		return "Ruoli [RuoloID=" + ruoloID + ", Descrizione=" + descrizione + "]";
	}

}
