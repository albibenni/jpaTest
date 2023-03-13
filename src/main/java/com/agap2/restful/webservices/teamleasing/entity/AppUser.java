package com.agap2.restful.webservices.teamleasing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Table(name = "Appuser", schema = "dbo")
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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
	

	*/
	@OneToMany(mappedBy = "appUser", cascade = CascadeType.ALL)
	private List<Skills> skills;

	
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
		return "AppUser [userID=" + id + ", doYouBuzzID=" + doYouBuzzID + ", nome=" + nome + ", cognome=" + cognome
				+ ", citta=" + citta + ", regione=" + regione + ", cap=" + cap + ", patente=" + patente + ", roleID="
				+ roleID + ", isTeamLeader=" + isTeamLeader + ", isWorkingForAgap=" + isWorkingForAgap
				+ ", presentazione=" + presentazione + ", link=" + link + ", posizione=" + posizione + ", pathImg="
				+ pathImg + "]";
	}

}
