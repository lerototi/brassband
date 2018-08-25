package com.brassband.repository;

import org.springframework.data.repository.CrudRepository;

import com.brassband.model.ProfileUser;

public interface ProfileUserRepository<U> extends CrudRepository<ProfileUser, Long> {

}
