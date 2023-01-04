package kr.go.gov.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.go.gov.dto.MemberDTO;
import kr.go.gov.service.MemberService;



@Controller
@RequestMapping("/member/")
public class MemberController {
	private static final Logger log = LoggerFactory.getLogger(SampleController.class);	
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("loginForm")
	public String loginForm() throws Exception {
		return "member/loginForm";
	}
	
	@RequestMapping(value="login.do", method = RequestMethod.POST)
	public String login(MemberDTO dto, @RequestParam String id, @RequestParam String pw) throws Exception{
		session.invalidate();
		dto.setId(id);
		dto.setPw(pw);
		
		MemberDTO login = memberService.login(dto);
		if(login!=null) {
			session.setAttribute("member", login);
			session.setAttribute("sid", id);
			return "redirect:/";
		} else {
			return "redirect:/member/loginForm";
		}
	}
	
}
