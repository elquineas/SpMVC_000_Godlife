package com.godlife.app;

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
		return "/challenge/home";
	}
	
	@RequestMapping(value = "/cinsert", method = RequestMethod.GET)
	public String cinsert(Model model, HttpSession httpSession) {
		
		
		model.addAttribute("BODY", "CINPUT");
		
		return "/challenge/home";
	}

	@RequestMapping(value = "/cinsert", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String insert(@ModelAttribute CInputDto cinputDto, 
			Model model, 
			HttpSession httpSession) {
		
		cinputService.insert(cinputDto);

		return "redirect:/";
	}
	
	
}
