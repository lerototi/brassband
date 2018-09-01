package com.brassband.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brassband.model.Authority;
import com.brassband.repository.AuthorityRepository;

@Service
public class AuthorityService {

	@Autowired
	AuthorityRepository<Authority> authorityRepository;
	
	@Transactional
	public Authority findOne(Long id) {
		return authorityRepository.findOne(id);
	}
	
	@Transactional
	public Authority findByName(String role) {
		return authorityRepository.findByRole(role);
	}
}
