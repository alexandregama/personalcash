package com.personalcash.authenticator;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class HibernateUserDao implements Users {

	@Inject
	private EntityManager manager;
	
	@Override
	public boolean exists(User user) {
		String sql = "select u from User u where u.email = :email and u.password = :password";
		TypedQuery<User> query = manager.createQuery(sql, User.class);
		query.setParameter("email", user.getEmail());
		query.setParameter("password", user.getPassword());
		
		try {
			query.getSingleResult();
		} catch (NoResultException e) {
			return false;
		}
		return true;
	}

}
