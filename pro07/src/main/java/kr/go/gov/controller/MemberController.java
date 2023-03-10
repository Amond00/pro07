package kr.go.gov.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import kr.go.gov.util.SHA256;

import kr.go.gov.dto.MemberDTO;
import kr.go.gov.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("loginForm")
	public String loginForm() throws Exception {
		return "member/loginForm";
	}
	
	@RequestMapping(value="login.do", method = RequestMethod.POST)
	public String login(MemberDTO dto, @RequestParam String id, @RequestParam String pw,RedirectAttributes rttr) throws Exception{
		session.invalidate();
		dto.setId(id);
		String pwd = SHA256.encrypt(pw);
		dto.setPw(pwd);
		MemberDTO login = memberService.login(dto);
		memberService.MemberVisitedUp(id);
		if(login!=null) {
			session.setAttribute("member", login);
			session.setAttribute("sid", id);
			return "redirect:/";
		} else {
			rttr.addFlashAttribute("loginck","아이디 또는 비밀번호가 일치하지 않습니다.");
			return "redirect:/member/loginForm";
		}
	}
	
	@GetMapping("logout.do")
	public String logout() throws Exception {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("joinForm")
	public String joinForm(RedirectAttributes rttr) throws Exception {
		return "member/joinForm";
	}
	
	@GetMapping("joinForm2")
	public String joinForm2() throws Exception {
		return "member/joinForm2";
	}
	
	@RequestMapping(value="idck", method=RequestMethod.POST)
	public void idck(HttpServletResponse response, HttpServletRequest request, Model model,RedirectAttributes rttr) throws Exception {
		String id = request.getParameter("id");
		boolean result = false;
		MemberDTO dto = new MemberDTO();
		dto = memberService.idck(id);

		if(dto!=null){	//이미 있는 아이디임
			result = false;
		} else {
			result = true;
		}
		JSONObject json = new JSONObject();
		json.put("result", result);
		PrintWriter out = response.getWriter();
		out.println(json.toString());
	}
	
	@PostMapping("join.do")
	public String join(HttpServletRequest request, MemberDTO dto, RedirectAttributes rttr) throws Exception {
		dto.setId(request.getParameter("id"));
		String pw = request.getParameter("pw");
		String pwd = SHA256.encrypt(pw);
		dto.setPw(pwd);
		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		dto.setAddress(request.getParameter("address"));
		dto.setTel(request.getParameter("tel"));
		memberService.join(dto);
		rttr.addFlashAttribute("joinck","회원가입 성공");	
		return "redirect:/";

	}
	
	@GetMapping("shatest")
	public String sha() throws Exception {
		return "member/shatest";
	}
	@PostMapping(value="sha256")
	public String sha256(HttpServletRequest request,Model model) throws Exception {
		String pw = request.getParameter("pw");
		String pwd = SHA256.encrypt(pw);
		model.addAttribute(pwd);
		return "home";
	}

	
}
