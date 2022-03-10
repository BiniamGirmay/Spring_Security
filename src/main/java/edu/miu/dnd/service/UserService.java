package edu.miu.dnd.service;

import java.util.List;
import java.util.Optional;

import edu.miu.dnd.domain.User;

public interface UserService {
	public List<User> findAll();
	
	public Optional<User> findById(Long id);
	
	public User updateUser(User user);	
}
