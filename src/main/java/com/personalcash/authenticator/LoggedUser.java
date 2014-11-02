package com.personalcash.authenticator;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LoggedUser implements Serializable {

	private static final long serialVersionUID = 7938426591583930370L;
	
	private User user;

	public void login(User user) {
		this.user = user;
	}
	
	public boolean isLogged() {
		return this.user != null;
	}
	
	public User getUser() {
		return user;
	}
	
}
