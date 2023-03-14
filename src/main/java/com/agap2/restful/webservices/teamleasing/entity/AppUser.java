package com.agap2.restful.webservices.teamleasing.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "app_user")
public class AppUser {

	public AppUser(){}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "do_you_buzz_id")
	private int doYouBuzzID;

	private String nome;
	
	private String cap;


//	@OneToOne
//	@Transient
//	@JsonIgnore
//	private Partner partner;
	/*
	@OneToOne
	private Ruoli ruolo;

	*/
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Skills> skills;

	
	public int getDoYouBuzzID() {
		return doYouBuzzID;
	}

	public String getNome() {
		return nome;
	}


	public String getCap() {
		return cap;
	}

}
