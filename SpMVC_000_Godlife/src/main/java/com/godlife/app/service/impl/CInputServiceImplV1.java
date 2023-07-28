package com.godlife.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.godlife.app.dao.CInputDao;
import com.godlife.app.model.CInputDto;
import com.godlife.app.service.CInputService;

@Service
public class CInputServiceImplV1 implements CInputService {

	protected final CInputDao cinputDao;
	
	public CInputServiceImplV1(CInputDao cinputDao) {
		this.cinputDao = cinputDao;
	}

	public int cinsert(CInputDto cinputDto) {
		
		
		return cinputDao.cinsert(cinputDto);
	}

	public List<CInputDto> selectAll() {
		
		return cinputDao.selectAll();
	}

	@Transactional
	public CInputDto findById(String id) {
		
		CInputDto cinputDto = cinputDao.findById(id);
		
		return cinputDto;
	}

	public int update(CInputDto cinputdto) {
		
		int result = cinputDao.update(cinputdto);
		return result;
	}

	public int delete(String id) {
		int result = cinputDao.delete(id);
		return result;
	}

}
