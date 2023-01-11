package kr.go.gov.service;

import java.util.List;

import kr.go.gov.dto.MemberDTO;

public interface MemberService {
	public MemberDTO login(MemberDTO dto) throws Exception;
	public MemberDTO idck(String id) throws Exception;
	public void join(MemberDTO dto) throws Exception;
	public List<MemberDTO> memberList() throws Exception;
}
