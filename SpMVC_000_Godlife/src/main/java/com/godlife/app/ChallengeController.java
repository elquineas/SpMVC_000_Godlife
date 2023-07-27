package com.godlife.app;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.godlife.app.model.CInputDto;
import com.godlife.app.service.CInputService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/challenge")
public class ChallengeController {
	
	protected final CInputService cinputService;

	public ChallengeController(CInputService cinputService) {
		this.cinputService = cinputService;
	}

	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home(Model model) {
		
		return "challenge/home";
	}
	
	@RequestMapping(value = "/cinsert", method = RequestMethod.GET)
	public String cinsert(@ModelAttribute("CINP")CInputDto cinputDto) {
		
		return "challenge/cinput";
	}

	@RequestMapping(value = "/cinsert", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String insert(@ModelAttribute CInputDto cinputDto, 
			Model model, 
			HttpSession httpSession) {
		
		cinputService.insert(cinputDto);

		return "redirect:/";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@ModelAttribute("CINP")CInputDto cinputDto, Model model) {
		
		List<CInputDto> cinputList = cinputService.selectAll();
		model.addAttribute("CHALLS", cinputList);
		model.addAttribute("BODY", "LIST");
		
		return "challenge/list";
		
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(String id, Model model) {

		CInputDto cinputDto = cinputService.findById(id);

		// SELECT 된 주소를 model에 담아서 view 로 전달
		model.addAttribute("CHALL", cinputDto);

		return "home";
	}
	
	
	@ModelAttribute("CINP")
	public CInputDto cinputDto() {

		CInputDto cinputDto = CInputDto.builder()
					    .c_title("")		
					    .c_write("")	
					    .c_start("")			
					    .c_end("")	
					    .c_count(0)			
					    .c_detail("")
						.build();
		return cinputDto;
		
	}
	
}
