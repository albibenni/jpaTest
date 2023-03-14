package com.agap2.restful.webservices.teamleasing.restController;

import com.agap2.restful.webservices.teamleasing.Service.UserRestService;
import com.agap2.restful.webservices.teamleasing.entity.AppUser;
import com.agap2.restful.webservices.teamleasing.entity.Skills;
import com.agap2.restful.webservices.teamleasing.exception.UserNotFoundException;
import com.agap2.restful.webservices.teamleasing.repository.AppUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserRestController {

    private AppUserRepository userRepository;
    private UserRestService userRestService;

    public UserRestController(AppUserRepository userRepository, UserRestService userRestService) {
        this.userRepository = userRepository;
        this.userRestService = userRestService;
    }

    @GetMapping("/users")
    public List<AppUser> retrieveAllUser() {
        return userRepository.findAll();

    }

    @GetMapping("/user/{id}")
    public AppUser retrieveUserById(@PathVariable Long id) {
        Optional<AppUser> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new UserNotFoundException("User Not found. id:" + id);

    }

//    @GetMapping("/user/skill/{id}")
//    public AppUser retrieveUserAndSkill(@PathVariable Long id) {
//        return userRestService.getSkillsForUser(id);
//    }

    @GetMapping("/user/skill/{id}")
    public Skills retrieveUserAndSkill(@PathVariable Long id) {
        return userRestService.getSkillsForUser(id);
    }

    /*
     * @GetMapping("/user/{id}") public AppUser retrieveUserById(@PathVariable int
     * id) throws SQLException {
     *
     * Optional<AppUser> user = userRepository.findById(id);
     *
     * if (user.isEmpty()) throw new UserNotFoundException("id:" + id);
     *
     * return user.get().mapRow(user.get());
     *
     * }
     */

}
