package com.godlife.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.godlife.app.dao.MemberDao;
import com.godlife.app.model.UserDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/member")
public class MemberController {
	private final MemberDao mDao;

	public MemberController(MemberDao mDao) {
		this.mDao = mDao;
	}

	@RequestMapping(value = "/login_check", method = RequestMethod.GET)
	@ResponseBody
	public String login_check(UserDto uDto, Model model) {
		int result = 0;
		
		// ID 있는지 체크
		result = mDao.idCheck(uDto);
		if(result < 1) {
			return "EXIST";
		}
		
		// PW 맞는지 체크		
		result = mDao.pwCheck(uDto);
		if(result < 1){
			return "WRONGPW";
		}else {
			return "YES";
		}
	}
	
	@RequestMapping(value = "/login/kakao", method = RequestMethod.GET)
	public String getKakaoUserInfo(@RequestParam("code") String code, Model model) {
	    System.out.println("OAuth Code : "+code);
	    
		return "login";
	}
	

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("BODY","JOIN");
		return "member";
	}
	
	@RequestMapping(value = "/findId", method = RequestMethod.GET)
	public String findId(Model model) {
		model.addAttribute("BODY","FINDID");
		return "member";
	}
	
	@RequestMapping(value = "/findPw", method = RequestMethod.GET)
	public String findPw(Model model) {
		model.addAttribute("BODY","FINDPW");
		return "member";
	}

	
}
