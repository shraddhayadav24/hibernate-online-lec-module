package com.jsp.lecture.service;

import java.util.List;

import com.jsp.lecture.dao.BatchesDao;
import com.jsp.lecture.dto.Batches;

public class BatchesService {

	BatchesDao batchesDao=new BatchesDao();
	
	public Batches saveBatches(Batches batches) {
		return batchesDao.saveBatches(batches);
	}
	
	public boolean updateBatchStatusbyId(int id, String status) {
		return batchesDao.updateBatchStatusbyId(id, status);
	}
	
	public Batches getbatchbyId(int id) {
		return batchesDao.getbatchbyId(id);
	}
	
	public List<Batches> gettAllBatches(){
		return batchesDao.gettAllBatches();
	}
}
