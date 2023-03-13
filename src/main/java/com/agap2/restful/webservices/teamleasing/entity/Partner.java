package com.agap2.restful.webservices.teamleasing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Partner", schema = "dbo")
public class Partner {

	public Partner() {
		super();
	}

	//questo genera l'id della tabella, solitamente e' la primary key della tabella
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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
