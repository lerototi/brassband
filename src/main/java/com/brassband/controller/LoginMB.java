package com.brassband.controller;

import javax.faces.bean.ManagedBean;

import org.springframework.security.core.context.SecurityContextHolder;

import com.brassband.model.User;

@ManagedBean
public class LoginMB {

	public LoginMB() {
		getUserLoginInfo();
	}

	private User user;

	// Object principal =
	// SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	public void getUserLoginInfo() {
		SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//System.out.println(userDetails.getUsername());
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
