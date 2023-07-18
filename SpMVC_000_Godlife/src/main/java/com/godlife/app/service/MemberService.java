package com.godlife.app.service;

import com.godlife.app.model.UserDto;

public interface MemberService {
	public String loginCheck(UserDto uDto);
	public String joinSave(UserDto uDto);
	public String findIdByTel(String tel);
}
