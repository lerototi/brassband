package com.brassband.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brassband.model.ProfileUser;
import com.brassband.model.User;
import com.brassband.repository.ProfileUserRepository;

@Service
public class ProfileUserService {

	@Autowired
	ProfileUserRepository<ProfileUser> profileUserRepository;
	
	@Transactional
	public boolean addProfileUser(ProfileUser profileUser, User user) {
		
		profileUser.setUser(user);
		return profileUserRepository.save(profileUser) != null;
	}
	
}
