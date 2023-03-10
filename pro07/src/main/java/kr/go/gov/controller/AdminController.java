package kr.go.gov.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.dto.BoardDTO2;
import kr.go.gov.dto.BoardDTO3;
import kr.go.gov.dto.MemberDTO;
import kr.go.gov.service.BoardService;
import kr.go.gov.service.MemberService;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Inject
	BoardService boardService;
	
	@Inject
	MemberService memberService;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("adminPage")
	public String adminPage() throws Exception {
		return "admin/admin";
	}
	
	//공지사항
	@GetMapping("list.do")
	@ResponseBody
	public List<BoardDTO> getadminBoardList() throws Exception {
		List<BoardDTO> boardList = boardService.boardList(); 
		return boardList;
	}
	
	@GetMapping("list2.do")
	@ResponseBody
	public List<BoardDTO2> getadminBoardList2() throws Exception {
		List<BoardDTO2> boardList = boardService.boardList2(); 
		return boardList;
	}
	
	@GetMapping("list3.do")
	@ResponseBody
	public List<BoardDTO3> getadminBoardList3() throws Exception {
		List<BoardDTO3> boardList = boardService.boardList3(); 
		return boardList;
	}
	
	@GetMapping("memlist.do")
	@ResponseBody
	public List<MemberDTO> getadminMemberList() throws Exception {
		List<MemberDTO> memList = memberService.memberList();
		return memList;
	}
}
