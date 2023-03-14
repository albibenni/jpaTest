package com.agap2.restful.webservices.teamleasing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "skills")
public class Skills {

    public Skills() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skill;

    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(value = FetchMode.JOIN)
    private AppUser user;


    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Skills [skillID=" + id + ", skill=" + skill + "]";
    }

}
