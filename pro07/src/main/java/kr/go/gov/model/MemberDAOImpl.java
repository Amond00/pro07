package kr.go.gov.model;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.go.gov.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public MemberDTO login(MemberDTO dto) throws Exception {
		return sqlSession.selectOne("member.login", dto);
	}
	
	@Override
	public void MemberVisitedUp(String id) throws Exception{
		sqlSession.update("member.memberVisitedUp", id);
	}
	
	@Override
	public MemberDTO idck(String id) throws Exception {	
		return sqlSession.selectOne("member.idck", id);
	}
	@Override
	public void join(MemberDTO dto) throws Exception {
		sqlSession.insert("member.join", dto);
	}
	
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return sqlSession.selectList("member.memberList");
	}
}
