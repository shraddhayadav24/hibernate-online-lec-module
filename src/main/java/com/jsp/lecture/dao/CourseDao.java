package com.jsp.lecture.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.lecture.dto.Course;

public class CourseDao {

EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entitymanager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entitymanager.getTransaction();
	
	
	public Course saveCourse(Course course) {
		entityTransaction.begin();
		entitymanager.persist(course);
		entityTransaction.commit();
		return course;
	}
	
	public Course getcoursebyId(int id) {
		Course course=entitymanager.find(Course.class, id);
		return course;
	}
	
	public List<Course> getAllCourse(){
		String sql="SELECT c FROM Course c";
		Query query=entitymanager.createQuery(sql);
		List<Course> courses=query.getResultList();
		return courses;
	}
	
}
