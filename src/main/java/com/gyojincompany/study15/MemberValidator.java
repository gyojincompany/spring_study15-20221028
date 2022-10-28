package com.gyojincompany.study15;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) { //검증할 객체의 클래스 타입정보
		// TODO Auto-generated method stub
		return MemberDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		MemberDto memberDto =  (MemberDto) target;
		
//		String memberId = memberDto.getId();
		int memberPw = memberDto.getPw();
		
//		if(memberId == null || memberId.trim().isEmpty()) {
//			errors.rejectValue("id", "trouble");
//		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "trouble");
		
		if(memberPw == 0) {
			errors.rejectValue("pw", "trouble");
		}

	}

}
