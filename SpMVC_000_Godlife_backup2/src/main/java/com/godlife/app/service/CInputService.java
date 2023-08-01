package com.godlife.app.service;

import java.util.List;

import org.springframework.ui.Model;

import com.godlife.app.model.CInputDto;




public interface CInputService {

	public int cinsert(CInputDto cinputDto);

	public List<CInputDto> selectAll();
	public List<CInputDto> selectPage(String page);

	public void selectPage(String page, Model model);
	public void selectPage(String page, Model model, String search);
	
	public List<CInputDto> findByCTitle(String ctitle);
	
	public CInputDto findById(long c_seq);
	

	public int update(CInputDto cinputdto);

	public int delete(String id);


}
