package com.jsp.lecture.controller;

import com.jsp.lecture.service.Adminservice;

public class IssueBatches {
public static void main(String[] args) {
	Adminservice adminservice=new Adminservice();
	boolean res=adminservice.issueBatchesById(0, 0, 0);
	System.out.println(res);
}
}
