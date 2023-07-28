package com.godlife.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.godlife.app.model.SInputDto;

public interface SInputDao {


	@Select("SELECT * FROM sinput ORDER BY s_start")
	public List<SInputDto> selectAll();

	
	public int sinsert(SInputDto sinputDto);

	@Select("SELECT * FROM sinput WHERE s_code = #{id}")
	public SInputDto findById(String id);


	public int supdate(SInputDto sinputdto);

	@Delete("DELETE FROM sinput WHERE s_code = #{id}")
	public int sdelete(String id);


	
	
}
