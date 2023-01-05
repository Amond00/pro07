package kr.go.gov.service;

import java.util.List;
import java.util.Map;

import kr.go.gov.dto.SampleDTO;

public interface SampleService {
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;
	public void addSample(SampleDTO sample) throws Exception;
	public Map<String, String> test1(String id, String pw) throws Exception;
}
