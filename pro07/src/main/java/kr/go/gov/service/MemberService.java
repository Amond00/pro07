package kr.go.gov.service;

import kr.go.gov.dto.MemberDTO;

public interface MemberService {
	public MemberDTO login(MemberDTO dto) throws Exception;

}
