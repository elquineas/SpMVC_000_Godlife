package com.godlife.app.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.godlife.app.model.CInputDto;

public interface CInputService {

	public int cinsert(CInputDto cinputDto);

	@Select(" SELECT * FROM cinput")
	public List<CInputDto> selectAll();

	
	public CInputDto findById(String id);

	public int update(CInputDto cinputdto);

	public int delete(String id);

}
