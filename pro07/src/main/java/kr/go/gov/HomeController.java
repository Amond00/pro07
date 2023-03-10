package kr.go.gov;


import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.service.BoardService;

@Controller
public class HomeController {
	
	@Inject
	BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws Exception {		
		return "home";
	}
	
	
	@GetMapping(value="main_board2.do")
	@ResponseBody
	public List<BoardDTO> mainBoard2(HttpServletResponse response, HttpServletRequest request, RedirectAttributes rttr) throws Exception{
		List<BoardDTO> list = boardService.boardList(); 
		return list;

	}

}
