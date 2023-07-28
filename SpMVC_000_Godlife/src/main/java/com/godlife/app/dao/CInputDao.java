package com.godlife.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.godlife.app.model.CInputDto;

public interface CInputDao {


	@Select("SELECT * FROM cinput ORDER BY c_start")
	public List<CInputDto> selectAll();

	
	public int cinsert(CInputDto cinputDto);

	@Select("SELECT * FROM cinput WHERE c_code = #{id}")
	public CInputDto findById(String id);


	public int update(CInputDto cinputdto);

	@Delete("DELETE FROM cinput WHERE c_code = #{id}")
	public int delete(String id);


	
	
}
