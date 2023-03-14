package com.agap2.restful.webservices.teamleasing.Service;

import com.agap2.restful.webservices.teamleasing.entity.Skills;
import com.agap2.restful.webservices.teamleasing.repository.AppUserRepository;
import com.agap2.restful.webservices.teamleasing.repository.SkillRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRestService {

    AppUserRepository userRepository;
    SkillRepository skillRepository;

    public UserRestService(AppUserRepository userRepository, SkillRepository skillRepository) {
        this.userRepository = userRepository;
        this.skillRepository = skillRepository;
    }

//    public AppUser getSkillsForUser(Long id) {
////        AppUser user = userRepository.FindBySkills_id(id).get();
//        AppUser user2 = userRepository.FindBySkills().get();
//
//        return user2;
//    }

    public Skills getSkillsForUser(Long id) {
//        AppUser user = userRepository.FindBySkills_id(id).get();
        Skills user2 = skillRepository.getSkills().get();

        return user2;
    }
}
