package kr.go.gov.model;


import kr.go.gov.dto.MemberDTO;

public interface MemberDAO {
	public MemberDTO login(MemberDTO dto) throws Exception;
}
