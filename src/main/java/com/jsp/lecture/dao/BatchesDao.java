package com.jsp.lecture.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.lecture.dto.Batches;


public class BatchesDao {

EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Batches saveBatches(Batches batches) {
		
		entityTransaction.begin();
		entityManager.persist(batches);
		entityTransaction.commit();
		
		return batches;
	}
	
	public boolean updateBatchStatusbyId(int id, String status) {
		Batches batches=entityManager.find(Batches.class, id);
		
		batches.setStatus(status);
		
		entityTransaction.begin();
		entityManager.merge(batches);
		entityTransaction.commit();
		
		return true;	
	}
	
	public Batches getbatchbyId(int id) {
		Batches batches=entityManager.find(Batches.class, id);
		return batches;
	}
	
	
	public List<Batches> gettAllBatches(){
		String sql="SELECT b FROM Batches b";
		Query query=entityManager.createQuery(sql);
		List<Batches> batches=query.getResultList();
		return batches;
	}
	
	
	
	public boolean issue(Batches batches) {
		entityTransaction.begin();
		entityManager.merge(batches);
		entityTransaction.commit();
		
		return true;
	}
	
}
