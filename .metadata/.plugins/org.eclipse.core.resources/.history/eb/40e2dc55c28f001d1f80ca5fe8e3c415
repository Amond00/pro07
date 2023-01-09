package kr.go.gov.model;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.go.gov.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public MemberDTO login(MemberDTO dto) throws Exception{
		return sqlSession.selectOne("member.login", dto);
		
	}
}
