package com.godlife.app.dao;

import com.godlife.app.model.UserDto;

public interface MemberDao {
	public int idCheck(UserDto uDto);
	public int pwCheck(UserDto uDto);
	
}
