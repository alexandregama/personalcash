package com.personalcash.authenticator;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AuthenticatorBean {

	private User user = new User();

	public void login() {
		System.out.println("LOGANDO!");
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
