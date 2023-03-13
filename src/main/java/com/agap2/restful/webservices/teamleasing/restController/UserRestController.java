package com.agap2.restful.webservices.teamleasing.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agap2.restful.webservices.teamleasing.entity.AppUser;
import com.agap2.restful.webservices.teamleasing.exception.UserNotFoundException;
import com.agap2.restful.webservices.teamleasing.repository.AppUserRepository;

@RestController
public class UserRestController {

	private AppUserRepository userRepository;

	public UserRestController(AppUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/users")
	public List<AppUser> retrieveAllUser() {
		return userRepository.findAll();

	}
	
	@GetMapping("/user/{id}")
	public Optional<AppUser> retrieveUserById(@PathVariable int id) {
		Optional<AppUser> user = userRepository.findById(id);

		if (user.isEmpty())
			throw new UserNotFoundException("User Not found. id:" + id);
		return user;


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
