package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

	@Id
	private Integer id;
	
	private String answer;
	
	private String question;
	
	private String dammy1;
	
	private String dammy2;
	
	private String dammy3;
	
}
