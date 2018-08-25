package com.brassband.repository;

import org.springframework.data.repository.CrudRepository;

import com.brassband.model.User;

public interface UserRepository<U> extends CrudRepository<User, Long> {

	User findByMail(String mail);
	//User findByLogin(String login);
	
	
}
