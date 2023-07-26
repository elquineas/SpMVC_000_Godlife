package com.godlife.app.service.impl;

import org.springframework.stereotype.Service;

import com.godlife.app.dao.CInputDao;
import com.godlife.app.model.CInputDto;
import com.godlife.app.service.CInputService;

@Service
public class CInputServiceImplV1 implements CInputService {

	protected final CInputDao cinputDao;
	
	public CInputServiceImplV1(CInputDao cinputDao) {
		this.cinputDao = cinputDao;
	}

	public int insert(CInputDto cinputDto) {
		
		
		return cinputDao.insert(cinputDto);
	}


}
