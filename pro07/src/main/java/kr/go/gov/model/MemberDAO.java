package kr.go.gov.model;


import kr.go.gov.dto.MemberDTO;

public interface MemberDAO {
	public MemberDTO login(MemberDTO dto) throws Exception;
	public MemberDTO idck(String id) throws Exception;
	public void join(MemberDTO dto) throws Exception;
}
