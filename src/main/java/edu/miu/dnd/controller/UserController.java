package edu.miu.dnd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.dnd.domain.User;
import edu.miu.dnd.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<User> findUsers() {
		return userService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		return ResponseEntity.ok("User Deleted Successfuly.");
	}
}
