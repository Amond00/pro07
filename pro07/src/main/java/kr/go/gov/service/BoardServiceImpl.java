package kr.go.gov.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.dto.BoardDTO2;
import kr.go.gov.dto.BoardDTO3;
import kr.go.gov.model.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDAO boardDAO;
	//공지사항
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDAO.boardList();
	}
	
	@Override
	public void boardVisitedUp(int no) throws Exception{
		boardDAO.boardVisitedUp(no);
	}

	@Override
	public BoardDTO boardDetail(int no) throws Exception {
		return boardDAO.boardDetail(no);
	}
	
	@Override
	public void boardInsert(BoardDTO dto) throws Exception{
		boardDAO.boardInsert(dto);
	}
	
	@Override
	public void boardUpdate(BoardDTO dto) throws Exception{
		boardDAO.boardUpdate(dto);
	}
	
	@Override
	public void boardDelete(int no) throws Exception{
		boardDAO.boardDelete(no);
	}
	
	//자유게시판
	@Override
	public List<BoardDTO2> boardList2() throws Exception {
		return boardDAO.boardList2();
	}

	@Override
	public void boardVisitedUp2(int no) throws Exception{
		boardDAO.boardVisitedUp2(no);
	}
	
	@Override
	public BoardDTO2 boardDetail2(int no) throws Exception {
		return boardDAO.boardDetail2(no);
	}
	
	@Override
	public void boardInsert2(BoardDTO2 dto) throws Exception{
		boardDAO.boardInsert2(dto);
	}
	
	@Override
	public void boardUpdate2(BoardDTO2 dto) throws Exception{
		boardDAO.boardUpdate2(dto);
	}
	
	@Override
	public void boardDelete2(int no) throws Exception{
		boardDAO.boardDelete2(no);
	}
	
	//QnA게시판
	@Override
	public BoardDTO3 boardParno() throws Exception{
		return boardDAO.boardParno();
	}
	
	@Override
	public List<BoardDTO3> boardList3() throws Exception{
		return boardDAO.boardList3();
	}
	
	@Override
	public void boardVisitedUp3(int no) throws Exception{
		boardDAO.boardVisitedUp3(no);
	}
	
	@Override
	public BoardDTO3 boardDetail3(int parno) throws Exception{
		return boardDAO.boardDetail3(parno);
	}
	@Override
	public BoardDTO3 boardDetail3_1(int parno) throws Exception{
		return boardDAO.boardDetail3_1(parno);
	}
	
	@Override
	public void boardInsert3(BoardDTO3 dto) throws Exception{
		boardDAO.boardInsert3(dto);
	}
	@Override
	public void boardInsert3_1(BoardDTO3 dto) throws Exception{
		boardDAO.boardInsert3_1(dto);
	}
	
	@Override
	public void boardUpdate3(BoardDTO3 dto) throws Exception{
		boardDAO.boardUpdate3(dto);
	}
	@Override
	public void boardUpdate3_1(BoardDTO3 dto) throws Exception{
		boardDAO.boardUpdate3_1(dto);
	}
	@Override
	public void boardDelete3(int parno) throws Exception{
		boardDAO.boardDelete3(parno);
	}
}
