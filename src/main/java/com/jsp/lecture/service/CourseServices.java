package com.jsp.lecture.service;

import java.util.List;

import com.jsp.lecture.dao.CourseDao;
import com.jsp.lecture.dto.Course;

public class CourseServices {

	CourseDao courseDao=new CourseDao();
	
	public Course saveCourse(Course course) {
		return courseDao.saveCourse(course);
	}
	public Course getcoursebyId(int id) {
		return courseDao.getcoursebyId(id);
	}
	public List<Course> getAllCourse(){
	 return courseDao.getAllCourse();	
	}
}
