package com.agap2.restful.webservices.teamleasing.repository;


import com.agap2.restful.webservices.teamleasing.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

import com.agap2.restful.webservices.teamleasing.entity.AppUser;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

//    @Query(value = "select * from app_user au, skills s where au.id = ?1", nativeQuery = true)
//    Optional<AppUser> FindBySkills_id(Long id);
//    @Query(value = "select * from app_user au, skills s", nativeQuery = true)
//    Optional<AppUser> FindBySkills();
}
