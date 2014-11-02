package com.personalcash.authenticator;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class EntityManagerProducer {

	@Inject
	private EntityManagerFactory factory;
	
	@Produces @RequestScoped
	public EntityManager get() {
		return factory.createEntityManager();
	}
	
}
