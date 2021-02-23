package com.resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbResource {
private EntityManager manager;
	
	public static EntityManager getEntityManager() {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("OrderProduct"); //Connection in JDBC
			EntityManager manager = emf.createEntityManager();
		return manager;
	}
	
}
