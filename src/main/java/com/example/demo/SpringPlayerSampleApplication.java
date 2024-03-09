package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerServiceImpl;

@SpringBootApplication
public class SpringPlayerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPlayerSampleApplication.class, args)
		.getBean(SpringPlayerSampleApplication.class).execute();
	}
	
	@Autowired
	PlayerServiceImpl service;

	private void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Iterable<Player> players = service.selectAll();
		for(Player player : players) {
			System.out.println(player);
		}
	}

}
