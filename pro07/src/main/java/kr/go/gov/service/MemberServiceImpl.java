package kr.go.gov.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.go.gov.dto.MemberDTO;
import kr.go.gov.model.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDAO memberDAO;
	
	@Override
	public MemberDTO login(MemberDTO dto) throws Exception{
		return memberDAO.login(dto);
	}
	
	@Override
	public void MemberVisitedUp(String id) throws Exception{
		memberDAO.MemberVisitedUp(id);
	}
	
	@Override
	public MemberDTO idck(String id) throws Exception{
		return memberDAO.idck(id);
	}
	
	@Override
	public void join(MemberDTO dto) throws Exception{
		memberDAO.join(dto);
	}
	
	@Override
	public List<MemberDTO> memberList() throws Exception{
		return memberDAO.memberList();
	}
	
}
