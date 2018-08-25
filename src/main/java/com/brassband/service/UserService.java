package com.brassband.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brassband.model.ProfileUser;
import com.brassband.model.User;
import com.brassband.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository<User> userRepository;
	
	@Transactional
	public List<User> getAllUsers(){
		System.out.println("service");
		return (List<User>) userRepository.findAll();
	}
	
	@Transactional
	public User findByMail(String mail){
		return userRepository.findByMail(mail);
	}
	
	/*@Transactional
	public User findByLogin(String login) {
		return userRepository.findByLogin(login);
	}*/
	
	@Transactional
	public boolean addUser(User user, ProfileUser profileUser) {
		
		Date date = new Date();
		
		//set actual date
		profileUser.setDateOfCreationProfile(date);
			
		user.setPflUser(profileUser);
		return userRepository.save(user) != null;
	}
	
	@Transactional 
	public boolean updateUser(User user) {
		return userRepository.save(user) != null;
	}
	
	@Transactional
	public void deleteUser(Long userId) {
		userRepository.delete(userId);
	}
	
	
	@Transactional
	public User getById(Long id) {
		return userRepository.findOne(id);
	}
}
