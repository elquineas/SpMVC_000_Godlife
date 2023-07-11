package com.godlife.app;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/member")
public class MemberController {
	
//	@GetMapping(value = "/social/login/kakao", produces = MediaType.APPLICATION_JSON_VALUE)
//	@ApiOperation(value = "카카오 간편로그인 테스트", notes = "카카오 간편로그인 시 활용한다.")
//	@Description("Front로 부터 kakao Oauth를 받는다")
//	@CustomApiResponse
//	public void getKakaoUserInfo(String code) {
//	    System.out.println("OAuth Code : "+code);
//	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model) {
	    
		return "login";
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
