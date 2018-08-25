package com.brassband.repository;

import org.springframework.data.repository.CrudRepository;

import com.brassband.model.Authority;

public interface AuthorityRepository<U> extends CrudRepository<Authority, Long> {

	Authority findByName(String name);
	
	
}
