package com.jsp.lecture.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.lecture.dto.Admin;

public class AdminDao {

	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entitymanager.getTransaction();
		
		public Admin saveAdmin(Admin admin) {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			
			EntityManager entitymanager=entityManagerFactory.createEntityManager();
			
			EntityTransaction entityTransaction=entitymanager.getTransaction();
			
			
			entityTransaction.begin();
			entitymanager.persist(admin);
			entityTransaction.commit();
			return admin;
		}
	
		public Admin getAdminById(int id) {
			Admin admin=entitymanager.find(Admin.class,id);	
			return admin;
		}
		
		
}
