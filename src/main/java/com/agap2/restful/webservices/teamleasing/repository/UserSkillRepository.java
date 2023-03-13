package com.agap2.restful.webservices.teamleasing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.agap2.restful.webservices.teamleasing.entity.UserSkills;

@Repository
public interface UserSkillRepository extends JpaRepository<UserSkills, Integer> {

}
