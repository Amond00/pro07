package kr.go.gov.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.go.gov.dto.MemberDTO;
import kr.go.gov.model.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDAO memberDAO;
	
	public MemberDTO login(MemberDTO dto) throws Exception{
		return memberDAO.login(dto);
	}

}