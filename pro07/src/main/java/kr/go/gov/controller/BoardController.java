package kr.go.gov.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.dto.BoardDTO2;
import kr.go.gov.dto.BoardDTO3;
import kr.go.gov.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Inject
	BoardService boardService;
	
	@Autowired
	HttpSession session;
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
	
	//QnA게시판
	@GetMapping("list3.do")
	public String getBoardList3(Model model) throws Exception {
		List<BoardDTO3> boardList = boardService.boardList3();
		model.addAttribute("boardList", boardList);
		return "board/boardList3";
	}
	
	@GetMapping("detail3.do")
	public String getBoardDetail3(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		int parno = Integer.parseInt(request.getParameter("no"));
		BoardDTO3 dto1 = boardService.boardDetail3(parno);
		BoardDTO3 dto2 = boardService.boardDetail3_1(parno);
		model.addAttribute("dto1", dto1);
		model.addAttribute("dto2", dto2);
		boardService.boardVisitedUp3(no);
		return "board/boardDetail3";
	}
	
	//질문 글 작성
	@GetMapping("insertForm3.do")
	public String boardInsertForm3(Model model) throws Exception{
		BoardDTO3 dto = boardService.boardParno();
		model.addAttribute("dto", dto);
		return "board/boardInsert3";
	}
	@PostMapping("insert3.do")
	public String boardInsert3(HttpServletRequest request, BoardDTO3 dto) throws Exception {
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		dto.setAuthor(request.getParameter("author"));
		boardService.boardInsert3(dto);
		return "redirect:list3.do";
	}
	//답변 글 작성
	@GetMapping("insertForm3_1.do")
	public String boardInsertForm31(HttpServletRequest request,Model model) throws Exception{
		int parno = Integer.parseInt(request.getParameter("parno"));
		BoardDTO3 dto1 = boardService.boardDetail3(parno);
		model.addAttribute("dto1", dto1);
		return "board/boardInsert3_1";
	}
	@PostMapping("insert3_1.do")
	public String boardInsert31(HttpServletRequest request, BoardDTO3 dto) throws Exception {
		int parno = Integer.parseInt(request.getParameter("parno"));
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		dto.setAuthor(request.getParameter("author"));
		dto.setParno(parno);
		boardService.boardInsert3_1(dto);
		return "redirect:list3.do";
	}
	
	//글 수정 폼 질문글, 답변글
	@GetMapping("updateForm3.do")
	public String boardUpdateForm3(HttpServletRequest request, Model model) throws Exception{
		int parno = Integer.parseInt(request.getParameter("parno"));
		BoardDTO3 dto = boardService.boardDetail3(parno);
		model.addAttribute("dto", dto);
		return "board/boardUpdate3";
	}
	@GetMapping("updateForm3_1.do")
	public String boardUpdateForm31(HttpServletRequest request, Model model) throws Exception{
		int parno = Integer.parseInt(request.getParameter("parno"));
		BoardDTO3 dto = boardService.boardDetail3_1(parno);
		model.addAttribute("dto", dto);
		return "board/boardUpdate3_1";
	}
	
	
	
	
	//글 삭제
	@GetMapping("delete3.do")
	public String boardDelete3(HttpServletRequest request) throws Exception {
		int parno = Integer.parseInt(request.getParameter("parno"));
		boardService.boardDelete3(parno);
		return "redirect:list3.do";
	}
	
}
