package com.godlife.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.godlife.app.dao.SInputDao;
import com.godlife.app.model.SInputDto;
import com.godlife.app.service.SInputService;

@Service
public class SInputServiceImplV1 implements SInputService {

	protected final SInputDao sinputDao;
	
	public SInputServiceImplV1(SInputDao sinputDao) {
		this.sinputDao = sinputDao;
	}

	public int sinsert(SInputDto sinputDto) {
		
		
		return sinputDao.sinsert(sinputDto);
	}

	public List<SInputDto> selectAll() {
		
		return sinputDao.selectAll();
	}

	@Transactional
	public SInputDto findById(String id) {
		
		SInputDto sinputDto = sinputDao.findById(id);
		
		return sinputDto;
	}

	public int update(SInputDto sinputdto) {
		
		int result = sinputDao.supdate(sinputdto);
		return result;
	}

	public int delete(String id) {
		int result = sinputDao.sdelete(id);
		return result;
	}

}
