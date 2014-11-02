package com.personalcash.authenticator;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AuthenticatorBean {

	private User user = new User();

	@Inject
	private Users users;
	
	@Inject
	private LoggedUser loggedUser;

	public String login() {
		if (users.exists(this.user)) {
			loggedUser.login(user);
			return "index?faces-redirect=true";
		}
		return "login";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
