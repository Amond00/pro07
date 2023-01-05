package kr.go.gov.service;

import java.util.List;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.dto.BoardDTO2;

public interface BoardService {
	public List<BoardDTO> boardList() throws Exception;
	public void boardVisitedUp(int no) throws Exception;
	public BoardDTO boardDetail(int no) throws Exception;
	public void boardInsert(BoardDTO dto) throws Exception;
	public void boardUpdate(BoardDTO dto) throws Exception;
	public void boardDelete(int no) throws Exception;
	
	public List<BoardDTO2> boardList2() throws Exception;
	public void boardVisitedUp2(int no) throws Exception;
	public BoardDTO2 boardDetail2(int no) throws Exception;
	public void boardInsert2(BoardDTO2 dto) throws Exception;
	public void boardUpdate2(BoardDTO2 dto) throws Exception;
	public void boardDelete2(int no) throws Exception;
}
