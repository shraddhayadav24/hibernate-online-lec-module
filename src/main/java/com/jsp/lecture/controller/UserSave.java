package com.jsp.lecture.controller;

import com.jsp.lecture.dto.User;
import com.jsp.lecture.service.UserServices;

public class UserSave {
public static void main(String[] args) {
	UserServices userServices=new UserServices();
	User user=new User();
	user.setU_name("shardul");
	user.setU_email("shardul@mail.com");

	userServices.saveUser(user);
}
}
