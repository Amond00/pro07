package kr.go.gov.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.go.gov.dto.SampleDTO;
import kr.go.gov.service.SampleService;

@Controller
@RequestMapping("/sample/")
public class SampleController {

	@Autowired
	SampleService sampleService;
	
	@GetMapping("list")
	public String sampleList(Model model) throws Exception {
		List<SampleDTO> sampleLst = sampleService.sampleList();
		model.addAttribute("sampleList", sampleLst);
		return "sample/list";
	}
	
	@GetMapping("getSample")
	public String getSample(@RequestParam String id, Model model) throws Exception {
		SampleDTO sample = sampleService.getSample(id);
		model.addAttribute("sample", sample);
		return "sample/getSample";
	}
	
	@GetMapping("test1")
	@ResponseBody
	public Map<String, String> test1(@PathVariable("id") String id, @PathVariable("pw") String pw) throws Exception{
		Map<String, String> res = sampleService.test1(id, pw);
		return res;
	}
}
