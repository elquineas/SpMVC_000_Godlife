package com.godlife.app.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.godlife.app.model.SInputDto;

public interface SInputService {

	public int sinsert(SInputDto sinputDto);

	@Select(" SELECT * FROM sinput")
	public List<SInputDto> selectAll();

	
	public SInputDto findById(String id);

	public int update(SInputDto sinputdto);

	public int delete(String id);

}
