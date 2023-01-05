package kr.go.gov.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.gov.dto.SampleDTO;
import kr.go.gov.model.SampleDAO;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	SampleDAO sampleDAO;
	
	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return sampleDAO.sampleList();
	}

	@Override
	public SampleDTO getSample(String id) throws Exception {
		return sampleDAO.getSample(id);
	}

	@Override
	public void addSample(SampleDTO sample) throws Exception {
		sampleDAO.addSample(sample);
	}
	
	@Override
	public Map<String, String> test1(String id, String pw) throws Exception{
		sampleDAO.
	}
}
