package kr.go.gov.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.dto.BoardDTO2;
import kr.go.gov.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Inject
	BoardService boardService;
	//공지사항
	@GetMapping("list.do")
	public String getBoardList(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.boardList(); 
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
	
	@GetMapping("detail.do")	
	public String getBoardDetail(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO dto = boardService.boardDetail(no);
		model.addAttribute("dto", dto);
		boardService.boardVisitedUp(no);
		return "board/boardDetail";
	}
	
	@GetMapping("insertForm.do")
	public String boardInsertForm() throws Exception{
		return "board/boardInsert";
	}
	
	@PostMapping("insert.do")
	public String boardInsert(HttpServletRequest request, BoardDTO dto) throws Exception {
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		dto.setAuthor(request.getParameter("author"));
		boardService.boardInsert(dto);
		return "redirect:list.do";
	}
	
	@GetMapping("updateForm.do")
	public String boardUpdateForm(HttpServletRequest request, Model model) throws Exception{
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO dto = boardService.boardDetail(no);
		model.addAttribute("dto", dto);
		return "board/boardUpdate";
	}
	
	@PostMapping("update.do")
	public String boardUpdate(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO dto = new BoardDTO();
		dto.setNo(no);
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardUpdate(dto);
		return "redirect:list.do";
	}
	
	@GetMapping("delete.do")
	public String boardDelete(HttpServletRequest request) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		boardService.boardDelete(no);
		return "redirect:list.do";
	}
	
	//자유게시판
	@GetMapping("list2.do")
	public String getBoardList2(Model model) throws Exception {
		List<BoardDTO2> boardList = boardService.boardList2();
		model.addAttribute("boardList", boardList);
		return "board/boardList2";
	}
	
	@GetMapping("detail2.do")
	public String getBoardDetail2(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO2 dto = boardService.boardDetail2(no);
		model.addAttribute("dto", dto);
		boardService.boardVisitedUp2(no);
		return "board/boardDetail2";
	}
	
	@GetMapping("insertForm2.do")
	public String boardInsertForm2() throws Exception{
		return "board/boardInsert2";
	}
	
	@PostMapping("insert2.do")
	public String boardInsert2(HttpServletRequest request, BoardDTO2 dto) throws Exception {
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		dto.setAuthor(request.getParameter("author"));
		boardService.boardInsert2(dto);
		return "redirect:list2.do";
	}
	
	@GetMapping("updateForm2.do")
	public String boardUpdateForm2(HttpServletRequest request, Model model) throws Exception{
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO2 dto = boardService.boardDetail2(no);
		model.addAttribute("dto", dto);
		return "board/boardUpdate2";
	}
	
	@PostMapping("update2.do")
	public String boardUpdate2(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO2 dto = new BoardDTO2();
		dto.setNo(no);
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardUpdate2(dto);
		return "redirect:list2.do";
	}
	
	@GetMapping("delete2.do")
	public String boardDelete2(HttpServletRequest request) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		boardService.boardDelete2(no);
		return "redirect:list2.do";
	}
	
}