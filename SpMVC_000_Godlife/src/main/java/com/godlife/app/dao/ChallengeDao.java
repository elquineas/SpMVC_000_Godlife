package com.godlife.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.godlife.app.model.ChallengeDto;

public interface ChallengeDao {
	
	public List<ChallengeDto> selectAll();
	public List<ChallengeDto> selectSearchAll(String search);
	public int countChallenge(String u_email);
	

}
