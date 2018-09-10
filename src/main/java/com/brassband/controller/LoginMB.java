package com.brassband.controller;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.brassband.model.User;
import com.brassband.service.UserService;

@ManagedBean
@Component
public class LoginMB {

	@Autowired
	private UserService userService;
	private User currentUser;

	// Object principal =
	// SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	public String getCurrentUserName() {
		
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		return userDetails.getUsername();
	}

	public User getCurrentUser() {
		
		if(currentUser== null) {
			 currentUser = userService.findByMail(getCurrentUserName());
			 System.out.println("service "+currentUser.getPflUser().getName());
			return currentUser;
			
		}else
			
		return currentUser;
	}
	
}
