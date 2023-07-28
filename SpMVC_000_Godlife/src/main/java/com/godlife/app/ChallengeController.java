package com.godlife.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.godlife.app.model.CInputDto;
import com.godlife.app.model.SInputDto;
import com.godlife.app.service.CInputService;
import com.godlife.app.service.SInputService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/challenge")
public class ChallengeController {
	
	protected final CInputService cinputService;
	protected final SInputService sinputService;

	public ChallengeController(CInputService cinputService, SInputService sinputService) {
		this.cinputService = cinputService;
		this.sinputService = sinputService;
	}

	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home(Model model) {
		
		return "/challenge/home";
	}
	
	@RequestMapping(value = "/cinsert", method = RequestMethod.GET)
	public String cinsert(@ModelAttribute("CINP")CInputDto cinputDto) {
		
		return "/challenge/cinput";
	}

	@RequestMapping(value = "/cinsert", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String insert(@ModelAttribute("CINP") CInputDto cinputDto, 
			Model model, 
			HttpSession httpSession) {
		
		cinputService.cinsert(cinputDto);

		return "redirect:/challenge/list";
	}
	
	@RequestMapping(value = "/sinsert", method = RequestMethod.GET)
	public String sinsert(@ModelAttribute("SINP")SInputDto sinputDto) {
		
		return "/challenge/sinput";
	}

	@RequestMapping(value = "/sinsert", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String sinsert(@ModelAttribute("SINP") SInputDto sinputDto, 
			Model model, 
			HttpSession httpSession) {
		
		sinputService.sinsert(sinputDto);

		return "redirect:/challenge/list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@ModelAttribute("CINP")CInputDto cinputDto, 
			@ModelAttribute("SINP")SInputDto sinputDto, Model model) {
		
		List<CInputDto> cinputList = cinputService.selectAll();
		List<SInputDto> sinputList = sinputService.selectAll();
		
		model.addAttribute("CHALLS", cinputList);
		model.addAttribute("SCHAS", sinputList);
		
		return "/challenge/list";
		
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(String id, Model model) {

		CInputDto cinputDto = cinputService.findById(id);

		// SELECT 된 주소를 model에 담아서 view 로 전달
		model.addAttribute("CHALL", cinputDto);

		return "/challenge/detail";
	}
	
	@RequestMapping(value = "/sdetail", method = RequestMethod.GET)
	public String sdetail(String id, Model model) {

		SInputDto sinputDto = sinputService.findById(id);

		// SELECT 된 주소를 model에 담아서 view 로 전달
		model.addAttribute("SCHA", sinputDto);

		return "/challenge/sdetail";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(String id, Model model) {

		// 변경할 주소 데이터 SELETE 하여 model 에 담기
		CInputDto cinputDto = cinputService.findById(id);
		model.addAttribute("CHALL", cinputDto);


		return "/challenge/update";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String update(@ModelAttribute CInputDto cinputdto) {
		int result = cinputService.update(cinputdto);

		String id = cinputdto.getC_code();
			// update 가 성공하면 detail 화면을 보여서 변경 된것을 확인
		if (result > 0) {
			return "redirect:/challenge/detail?id=" + id;
			// update 가 실패하면 다시 update 화면으로 보내서 다시 변경하기
		} else {
			return "redirect:/challenge/update?id=" + id;
		}
	}
	
	@RequestMapping(value = "/supdate", method = RequestMethod.GET)
	public String supdate(String id, Model model) {

		// 변경할 주소 데이터 SELETE 하여 model 에 담기
		SInputDto sinputDto = sinputService.findById(id);
		model.addAttribute("SCHA", sinputDto);


		return "/challenge/supdate";

	}

	@RequestMapping(value = "/supdate", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String supdate(@ModelAttribute SInputDto sinputdto) {
		int result = sinputService.update(sinputdto);

		String id = sinputdto.getS_code();
			// update 가 성공하면 detail 화면을 보여서 변경 된것을 확인
		if (result > 0) {
			return "redirect:/challenge/sdetail?id=" + id;
			// update 가 실패하면 다시 update 화면으로 보내서 다시 변경하기
		} else {
			return "redirect:/challenge/supdate?id=" + id;
		}
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String id) {

		int result = cinputService.delete(id);

		if (result > 0) {
			return "redirect:/challenge/list";
		} else {
			return "redirect:/challenge/detail?id=" + id;
		}

	}
	
	@RequestMapping(value = "/sdelete", method = RequestMethod.GET)
	public String sdelete(String id) {

		int result = sinputService.delete(id);

		if (result > 0) {
			return "redirect:/challenge/list";
		} else {
			return "redirect:/challenge/sdetail?id=" + id;
		}

	}
	
	
	
	
	@ModelAttribute("CINP")
	public CInputDto cinputDto() {
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		String strDate = dateFormat.format(date);
		String strTime = timeFormat.format(date);

		CInputDto cinputDto = CInputDto.builder()
						.c_code("")
					    .c_title("")		
					    .c_write(strDate)	
					    .c_start("")			
					    .c_end("")	
					    .c_count(0)			
					    .c_detail("")
						.build();
		return cinputDto;
		
	}
	
	@ModelAttribute("SINP")
	public SInputDto sinputDto() {
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		String strDate = dateFormat.format(date);
		String strTime = timeFormat.format(date);

		SInputDto sinputDto = SInputDto.builder()
						.s_code("")
					    .s_title("")		
					    .s_write(strDate)	
					    .s_start("")			
					    .s_end("")	
					    .s_detail("")
						.build();
		return sinputDto;
		
	}
	
}
