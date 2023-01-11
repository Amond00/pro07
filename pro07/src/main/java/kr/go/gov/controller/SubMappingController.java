package kr.go.gov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub/")
public class SubMappingController {
	
	@GetMapping("portfolio")
	public String portfoli() throws Exception {
		return "sub/portfolio";
	}

		
}
