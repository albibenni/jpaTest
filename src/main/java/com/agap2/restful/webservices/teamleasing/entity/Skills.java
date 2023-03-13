package com.agap2.restful.webservices.teamleasing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Skills", schema = "dbo")
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String skill;

	@JsonIgnore
	private String icon;

	 @ManyToOne(fetch = FetchType.LAZY)
	 @Fetch(value = FetchMode.JOIN)
	 private AppUser user;


	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "Skills [skillID=" + id + ", skill=" + skill + ", icon=" + icon + "]";
	}

}
