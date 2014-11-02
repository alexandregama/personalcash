package com.personalcash.authenticator;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoggedUserTest {

	@Test
	public void shouldIdentifyThatUserIsNotLogged() throws Exception {
		LoggedUser loggedUser = new LoggedUser();
		
		assertFalse(loggedUser.isLogged());
	}
	
	@Test
	public void shouldIdentifyThatUserIsLogged() throws Exception {
		LoggedUser loggedUser = new LoggedUser();
		loggedUser.login(new User());
		
		assertTrue(loggedUser.isLogged());
	}
	
	@Test
	public void shouldReturnTheSameUserWasLogged() throws Exception {
		LoggedUser loggedUser = new LoggedUser();
		User alexandre = new User();
		loggedUser.login(alexandre);
		
		assertEquals(alexandre, loggedUser.getUser());
	}
	
}
