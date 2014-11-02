package com.personalcash.authenticator;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProducer {

	@Produces @ApplicationScoped
	public EntityManagerFactory get() {
		return Persistence.createEntityManagerFactory("personalcash");
	}
}
