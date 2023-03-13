package com.agap2.restful.webservices.teamleasing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.AssertFalse.List;
import jakarta.websocket.ClientEndpoint;

@Entity
@Table(name = "Userskills", schema = "dbo")
public class UserSkills {

	public UserSkills() {
		super();
	}

	@Id
	@PrimaryKeyJoinColumn
	@Column(name = "userid")
	private int userId;

	@PrimaryKeyJoinColumn
	@Column(name = "Skillid")
	private int skillId;

	@Column(name = "skilllevel")
	private int skillLevel;

	@JsonIgnore
	private boolean visible;

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	@Override
	public String toString() {
		return "UserSkill [userId=" + userId + ", skillId=" + skillId + ", skillLevel=" + skillLevel + ", visible="
				+ visible + "]";
	}

}
