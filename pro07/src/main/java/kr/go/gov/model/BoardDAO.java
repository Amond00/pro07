package kr.go.gov.model;

import java.util.List;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.dto.BoardDTO2;
import kr.go.gov.dto.BoardDTO3;

public interface BoardDAO {
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
	
	public List<BoardDTO3> boardList3() throws Exception;
	public void boardVisitedUp3(int no) throws Exception;
	public BoardDTO3 boardDetail3(int parno) throws Exception;
	public BoardDTO3 boardDetail3_1(int parno) throws Exception;
	
	public BoardDTO3 boardParno() throws Exception;
	public void boardInsert3(BoardDTO3 dto) throws Exception;
	public void boardInsert3_1(BoardDTO3 dto) throws Exception;
	public void boardUpdate3(BoardDTO3 dto) throws Exception;
	public void boardUpdate3_1(BoardDTO3 dto) throws Exception;
	public void boardDelete3(int parno) throws Exception;
}
