package kr.go.gov.dto;

import lombok.Data;

@Data
public class BoardDTO2 {
	private int no;
	private String title;
	private String content;
	private String author;
	private String resdate;
	private int visited;
}
