package com.godlife.app.service.impl;

import org.springframework.stereotype.Service;

import com.godlife.app.dao.MemberDao;
import com.godlife.app.model.UserDto;
import com.godlife.app.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	private final MemberDao mDao;

	public MemberServiceImpl(MemberDao mDao) {
		this.mDao = mDao;
	}

	@Override
	public String loginCheck(UserDto uDto) {
		int result = 0;
		// ID 있는지 체크
		
		result = mDao.idCheck(uDto);
		if(result < 1) {
			return "EXIST";
		}
		
		// PW 맞는지 체크		
		result = mDao.pwCheck(uDto);
		if(result < 1){
			return "WRONGPW";
		}else {
			return "YES";
		}
	}
	
	@Override
	public String joinSave(UserDto uDto) {
		int result = 0;
		// ID 있는지 체크
		result = mDao.idCheck(uDto);
		if(result > 0) {
			return "EXIST";
		}
		// DATA SAVE
		result = mDao.joinSave(uDto);
		if(result < 1) {
			return "SAVE";
		}else {
			return "ERROR";
		}
	}

	@Override
	public String findIdByTel(String tel) {
		int result = 0;
		// ID 있는지 체크
		result = mDao.findIdByTel(tel);
		if(result > 0) {
			return "EXIST";
		}
		return null;
	}


}
