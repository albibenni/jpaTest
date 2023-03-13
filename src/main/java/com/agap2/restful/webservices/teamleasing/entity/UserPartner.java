package com.agap2.restful.webservices.teamleasing.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "userpartner", schema = "dbo")
public class UserPartner {

	//questo genera l'id della tabella, solitamente e' la primary key della tabella
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int partnerID;

	private String partener;
	private String descrizione;


}
