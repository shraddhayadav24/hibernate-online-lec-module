package com.jsp.lecture.service;

import java.util.List;

import com.jsp.lecture.dao.UserDao;
import com.jsp.lecture.dto.User;

public class UserServices {
	
	UserDao userDao=new UserDao();

	public User saveUser(User user) {
		return userDao.saveUser(user);
	}
	
	public User getUserbyId(int id) {
		return userDao.getUserbyId(id);
	}
	
	public List<User> getAllUser(){
		return userDao.getAllUser();
	}
}
