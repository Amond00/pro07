package kr.go.gov.model;

import java.util.List;

import kr.go.gov.dto.SampleDTO;

public interface SampleDAO {
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;
	public void addSample(SampleDTO sample) throws Exception;
}
