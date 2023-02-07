package kr.go.gov.sample;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService{

	@Autowired
	SampleDAO sampleDAO;
	
	public List<SampleDTO> sampleList() throws Exception {
		return sampleDAO.sampleList();
	}
	public SampleDTO getSample(String id) throws Exception {
		return sampleDAO.getSample(id);
	}
	public void insertSample(SampleDTO sample) throws Exception{
		sampleDAO.insertSample(sample);
	}
	public void updateSample(SampleDTO sample) throws Exception{
		sampleDAO.updateSample(sample);
	}
	public void deleteSample(String id) throws Exception{
		sampleDAO.deleteSample(id);
	}
	
}
