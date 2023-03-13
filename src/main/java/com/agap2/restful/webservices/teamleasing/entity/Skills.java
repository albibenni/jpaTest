package com.agap2.restful.webservices.teamleasing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Skills", schema = "dbo")
public class Skills {

	public Skills() {
		super();
	}

	@Id
	@PrimaryKeyJoinColumn
	@Column(name = "skiliD")
	private int skilID;

	private String skill;

	@JsonIgnore
	private String icon;
/*
	 @ManyToOne
	 private AppUser user;
	 */
	public int getSkillID() {
		return skilID;
	}

	public void setSkillID(int skillID) {
		this.skilID = skillID;
	}

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
		return "Skills [skillID=" + skilID + ", skill=" + skill + ", icon=" + icon + "]";
	}

}
