package com.godlife.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.godlife.app.model.SInputDto;

public interface SInputDao {


	@Select("SELECT * FROM tbl_schedule ORDER BY s_sdate")
	public List<SInputDto> selectAll();

	
	public int sinsert(SInputDto sinputDto);

	@Select("SELECT * FROM tbl_schedule WHERE s_seq = #{c_seq}")
	public SInputDto findById(long s_seq);


	public int supdate(SInputDto sinputdto);

	@Delete("DELETE FROM tbl_schedule WHERE s_seq = #{id}")
	public int sdelete(String id);

	@Select(" SELECT * FROM tbl_schedule "
			+ " WHERE s_title LIKE CONCAT('%', #{stitle}, '%' )"
			+ " ORDER BY s_title ")
	public List<SInputDto> findBySTitle(String stitle);

	@Select("SELECT * FROM tbl_schedule LIMIT #{limit} OFFSET #{offset} ")
	public List<SInputDto> selectPage(@Param("limit") int limit, @Param("offset") int intPageNum);

	
	@Select("SELECT COUNT(*) FROM tbl_schedule")
	public int selectCount();

	
	public int selectSearchCount(List<String> search);


	public List<SInputDto> selectSearchPage(
			@Param("limit") int limitCount,
			@Param("offset") int offsetNum,
			@Param("list") List<String> searchs);
	
	
}
