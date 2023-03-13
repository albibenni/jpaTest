package com.agap2.restful.webservices.teamleasing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "userpartner", schema = "dbo")
public class UserPartner {

	public UserPartner() {
		super();
	}

	@Id
	@PrimaryKeyJoinColumn
	private int partnerID;

	@PrimaryKeyJoinColumn
	private String partener;
	private String descrizione;


}
