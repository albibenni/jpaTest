package com.agap2.restful.webservices.teamleasing.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Appuser", schema = "dbo")
public class AppUser {

	public AppUser() {
		super();
	}

	@Id
	private int userID;

	@Column(name = "doyoubuzzid")
	private int doYouBuzzID;

	private String nome;
	
	private String cognome;
	
	private String citta;
	@JsonIgnore
	private String regione;
	
	private String cap;
	
	@JsonIgnore
	private Boolean patente;
	
	@JsonIgnore
	private int roleID;

	@Column(name = "isteamleader")
	private Boolean isTeamLeader;

	@Column(name = "isworkingforagap")
	private Boolean isWorkingForAgap;

	private String presentazione;

	@JsonIgnore
	private String link;
	
	private String posizione;

	@Column(name = "pathimg")
	@JsonIgnore
	private String pathImg;


	@OneToOne
	@Transient
	@JsonIgnore
	private Partner partner;
	/*
	@OneToOne
	private Ruoli ruolo;
	
	@OneToMany(mappedBy = "user")
	private List<Skills> skills;
	*/

	public int getUserID() {
		return userID;
	}
	
	public int getDoYouBuzzID() {
		return doYouBuzzID;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCitta() {
		return citta;
	}

	public String getRegione() {
		return regione;
	}

	public String getCap() {
		return cap;
	}

	public Boolean getPatente() {
		return patente;
	}

	public int getRoleID() {
		return roleID;
	}

	public Boolean getIsTeamLeader() {
		return isTeamLeader;
	}

	public Boolean getIsWorkingForAgap() {
		return isWorkingForAgap;
	}

	public String getPresentazione() {
		return presentazione;
	}

	public String getLink() {
		return link;
	}

	public String getPosizione() {
		return posizione;
	}

	public String getPathImg() {
		return pathImg;
	}

	@Override
	public String toString() {
		return "AppUser [userID=" + userID + ", doYouBuzzID=" + doYouBuzzID + ", nome=" + nome + ", cognome=" + cognome
				+ ", citta=" + citta + ", regione=" + regione + ", cap=" + cap + ", patente=" + patente + ", roleID="
				+ roleID + ", isTeamLeader=" + isTeamLeader + ", isWorkingForAgap=" + isWorkingForAgap
				+ ", presentazione=" + presentazione + ", link=" + link + ", posizione=" + posizione + ", pathImg="
				+ pathImg + "]";
	}

}
