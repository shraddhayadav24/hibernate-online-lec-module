package com.jsp.lecture.controller;

import com.jsp.lecture.dto.Batches;
import com.jsp.lecture.service.BatchesService;

public class BatchesSave {
public static void main(String[] args) {
	BatchesService batchesService=new BatchesService();
	Batches batches=new Batches();
	batches.setB_date("12/23");
	batches.setB_time("10.20");
	batches.setStatus("available");
	
	batchesService.saveBatches(batches);
}
}
