package com.jsp.lecture.controller;

import com.jsp.lecture.dto.Course;
import com.jsp.lecture.service.CourseServices;

public class CourseSave {
public static void main(String[] args) {
	CourseServices courseServices=new CourseServices();
	Course course=new Course();
	course.setC_name("webtech");
	course.setC_level("easy");
	course.setC_description("html");
	
	courseServices.saveCourse(course);
}
}
