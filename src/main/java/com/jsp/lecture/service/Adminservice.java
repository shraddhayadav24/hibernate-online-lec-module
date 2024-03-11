package com.jsp.lecture.service;

import com.jsp.lecture.dao.AdminDao;
import com.jsp.lecture.dao.BatchesDao;
import com.jsp.lecture.dao.CourseDao;
import com.jsp.lecture.dao.UserDao;
import com.jsp.lecture.dto.Admin;
import com.jsp.lecture.dto.Batches;
import com.jsp.lecture.dto.Course;
import com.jsp.lecture.dto.User;

public class Adminservice {

	BatchesDao batchesDao=new BatchesDao();
	UserDao userDao=new UserDao();
	AdminDao adminDao=new AdminDao();
	CourseDao courseDao=new CourseDao();
	
	public Admin saveAdmin(Admin admin) {
		return adminDao.saveAdmin(admin);
	}
	
	public Admin getAdminById(int id) {
		return adminDao.getAdminById(id);
	}
	
	public boolean issueBatchesById(int b_id, int c_id, int u_id) {
		Batches batches= batchesDao.getbatchbyId(b_id);
		//Admin admin=adminDao.getAdminById(id);
		User user=userDao.getUserbyId(u_id);
		Course course= courseDao.getcoursebyId(c_id);
		
		if(batches!=null && course!=null && user!=null) {
			batches.setStatus("allocated");
			batches.setUser(user);
			batches.setCourse(course);
			return batchesDao.issue(batches);

		}
		return false;
	}
}
