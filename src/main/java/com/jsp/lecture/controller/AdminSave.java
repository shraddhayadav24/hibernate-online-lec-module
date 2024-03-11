package com.jsp.lecture.controller;

import com.jsp.lecture.dto.Admin;
import com.jsp.lecture.service.Adminservice;

public class AdminSave {
public static void main(String[] args) {
	Adminservice adminservice=new Adminservice();
	Admin admin=new Admin();
	admin.setName("omkar");
	admin.setPassword("1234");
	adminservice.saveAdmin(admin);
}
}
