package com.gyojincompany.study15;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(MemberDto memberDto, BindingResult result) {
		
		MemberValidator validator = new MemberValidator();
		validator.validate(memberDto, result);
		
		if(result.hasErrors()) {
			return "login";
		} else {
			return "loginOk";
		}
		
		
	}
	
}
