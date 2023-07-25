package com.godlife.app.dao;

import com.godlife.app.model.UserDto;

public interface MemberDao {
	public int pwCheck(UserDto uDto);
	public int joinSave(UserDto uDto);
	public int findById(UserDto bDto);
	public int findIdByTel(String tel);
	
}
