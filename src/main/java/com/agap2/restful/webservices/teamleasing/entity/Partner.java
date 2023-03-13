package com.agap2.restful.webservices.teamleasing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Partner", schema = "dbo")
public class Partner {

	public Partner() {
		super();
	}

	@Id
	private int partnerID;

	private String partener;
	
	private String descrizione;
	
	@OneToOne(mappedBy = "partner")
	@JsonIgnore
	@Transient
	private AppUser appUser;

	public int getPartnerID() {
		return partnerID;
	}

	public String getPartener() {
		return partener;
	}

	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public String toString() {
		return "Partner [partnerID=" + partnerID + ", partener=" + partener + ", descrizione=" + descrizione + "]";
	}

}
