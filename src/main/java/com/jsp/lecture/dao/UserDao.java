package com.jsp.lecture.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.lecture.dto.User;

public class UserDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	
	public User getUserbyId(int id) {
		User user=entityManager.find(User.class, id);
		return user; 
	}
	
	public List<User> getAllUser(){
		String sql="SELECT u FROM User u";
		Query query=entityManager.createQuery(sql);
		List<User> users=query.getResultList();
		return users;
	}
}
