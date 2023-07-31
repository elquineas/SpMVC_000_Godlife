package com.godlife.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.godlife.app.model.CInputDto;

public interface CInputDao {


	@Select(" SELECT c_seq, c_uemail, c_title, "
			+ " c_memo, c_sdate, c_edate, "
			+ " IFNULL(c_achieve,(TIMESTAMPDIFF(DAY , c_sdate, c_edate)+1))AS c_achieve, "
			+ " c_count, c_share, c_useyn, u_nickname, "
			+ " FROM tbl_challenge "
			+ " LEFT JOIN tbl_user "
			+ " ON c_uemail = u_email "
			+ " WHERE c_share = 'Y'AND c_useyn = 'Y' ")
	public List<CInputDto> selectAll();

	public int cinsert(CInputDto cinputDto);

	@Select("SELECT * FROM tbl_challenge WHERE c_seq = #{c_seq}")
	public CInputDto findById(long c_seq);

	
	public int update(CInputDto cinputdto);

	@Delete("DELETE FROM tbl_challenge WHERE c_seq = #{id}")
	public int delete(String id);
	
	@Select(" SELECT * FROM tbl_challenge "
			+ " WHERE c_title LIKE CONCAT('%', #{ctitle}, '%' )"
			+ " ORDER BY c_title ")
	public List<CInputDto> findByCTitle(String ctitle);

	@Select("SELECT * FROM tbl_challenge LIMIT #{limit} OFFSET #{offset} ")
	public List<CInputDto> selectPage(@Param("limit") int limit, @Param("offset") int intPageNum);

	
	@Select("SELECT COUNT(*) FROM tbl_challenge")
	public int selectCount();

	
	public int selectSearchCount(List<String> search);


	public List<CInputDto> selectSearchPage(
			@Param("limit") int limitCount,
			@Param("offset") int offsetNum,
			@Param("list") List<String> searchs);




	
	
}
