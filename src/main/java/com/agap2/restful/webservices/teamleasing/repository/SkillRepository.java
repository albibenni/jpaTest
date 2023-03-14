package com.agap2.restful.webservices.teamleasing.repository;

import com.agap2.restful.webservices.teamleasing.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SkillRepository extends JpaRepository<Skills, Long> {

//    @Query(value = "select * from app_user au, skills s where au.id = ?1", nativeQuery = true)
//    Optional<Skills> FindBySkills_id(Long id);

    @Query(value = "select s.* from skills s join app_user au on s.app_user_id = au.id where au.cap = :cap_id", nativeQuery = true)
    List<Skills> getSkills(@Param("cap_id") String cap_id);

}
