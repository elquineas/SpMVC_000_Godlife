package com.godlife.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.godlife.app.dao.MemberDao;
import com.godlife.app.model.UserDto;
import com.godlife.app.service.MailService;
import com.godlife.app.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/member")
public class MemberController {
	@Autowired
	private MailService mailService;
	private final MemberService memberService;

	public MemberController(MemberDao mDao, MemberService memberService) {
		this.memberService = memberService;
	}

	@ResponseBody
	@RequestMapping(value = "/login_check", method = RequestMethod.GET)
	public String login_check(UserDto uDto, Model model) {
		String result = memberService.loginCheck(uDto);
		return result;
	}
	
//	@RequestMapping(value = "/login/kakao", method = RequestMethod.GET)
//	public String getKakaoUserInfo(@RequestParam("code") String code, Model model) {
//	    System.out.println("OAuth Code : "+code);
//		return "login";
//	}
	

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("BODY","JOIN");
		return "member";
	}

	@ResponseBody
	@RequestMapping(value = "/join_save", method = RequestMethod.GET)
	public String join_save(UserDto uDto, Model model) {
		String result = memberService.joinSave(uDto);
		return result;
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

	@RequestMapping("/findId/search")
	@ResponseBody
	public String searchId(String tel) throws Exception {
//		log.debug("확인 : {}",tel);
		String result = memberService.findIdByTel(tel);
		
		return result;
	}
	
	@RequestMapping("/findId/sendMail")
	@ResponseBody
	public String sendEmail(String tel, String email) throws Exception {
		ModelAndView mv = new ModelAndView();
//		String id, 
		log.debug("확인 : {}",tel);
		String addr = email;
		String subject = "[😀😀] 알림메일 입니다.";
		String body = "안녕하세요 SMTP메일 테스트입니다.";
		
		mailService.sendEmail(email, addr, subject, body);
		
		mv.setViewName("/");
		String result = "FAIL";
		return result;
	}
	
	
}
