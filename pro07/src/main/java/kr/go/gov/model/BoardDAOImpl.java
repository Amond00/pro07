package kr.go.gov.model;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.go.gov.dto.BoardDTO;
import kr.go.gov.dto.BoardDTO2;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Inject
	SqlSession sqlSession;
	
	//공지사항
	@Override
	public List<BoardDTO> boardList() throws Exception{
		return sqlSession.selectList("board.boardList");
	}
	
	@Override
	public void boardVisitedUp(int no) throws Exception{
		sqlSession.update("board.boardVisitedUp", no);
	}
	
	@Override
	public BoardDTO boardDetail(int no) throws Exception{
		return sqlSession.selectOne("board.boardDetail", no);
	}
	
	@Override
	public void boardInsert(BoardDTO dto) throws Exception{
		sqlSession.insert("board.boardInsert", dto);
	}
	
	@Override
	public void boardUpdate(BoardDTO dto) throws Exception{
		sqlSession.insert("board.boardUpdate", dto);
	}
	
	@Override
	public void boardDelete(int no) throws Exception{
		sqlSession.delete("board.boardDelete", no);
	}
	
	//자유게시판
	@Override
	public List<BoardDTO2> boardList2() throws Exception{
		return sqlSession.selectList("board.boardList2");
	}
	
	@Override
	public void boardVisitedUp2(int no) throws Exception{
		sqlSession.update("board.boardVisitedUp2", no);
	}
	
	@Override
	public BoardDTO2 boardDetail2(int no) throws Exception{
		return sqlSession.selectOne("board.boardDetail2", no);
	}
	
	@Override
	public void boardInsert2(BoardDTO2 dto) throws Exception{
		sqlSession.insert("board.boardInsert2", dto);
	}
	
	@Override
	public void boardUpdate2(BoardDTO2 dto) throws Exception{
		sqlSession.insert("board.boardUpdate2", dto);
	}
	
	@Override
	public void boardDelete2(int no) throws Exception{
		sqlSession.delete("board.boardDelete2", no);
	}
}
