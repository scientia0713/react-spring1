package com.example.demo.contoroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerServiceImpl;


@RestController
@CrossOrigin(origins = "*")
public class PlayerController {

	@Autowired
	PlayerServiceImpl service;
	
	@GetMapping("/player")
	@ResponseBody
	public Iterable<Player> showList() {
		
		Iterable<Player> playerList = service.selectAll();
		return playerList;
	}
	
	@PostMapping("create")
	public Player createPlayer(@RequestBody Player player) {
		
		service.insertPlayer(player);
		return player;
	}
	
}
