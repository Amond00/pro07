package kr.go.gov.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.gov.dto.SampleDTO;
import kr.go.gov.model.SampleDAO;

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
	public void addSample(SampleDTO sample) throws Exception{
		sampleDAO.addSample(sample);
	}
	public void updateSample(SampleDTO sample) throws Exception{
		sampleDAO.updateSample(sample);
	}
	public void deleteSample(String id) throws Exception{
		sampleDAO.deleteSample(id);
	}
	
	public Map<String, String> getSample2(String id, String pw){
		Map<String, String> res = new HashMap<>();
		res.put(id, pw);
		return res;
	}
	
	public List<String> getSample3(String id){
		List<String> lst = new ArrayList<String>();
		for(int i=0;i<5;i++) {
			lst.add(id+i);
		}
		return lst;
	}
}
