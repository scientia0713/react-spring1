package com.example.demo.service;

import com.example.demo.entity.Player;

public interface PlayerService {
	
	Iterable<Player> selectAll();

	void insertPlayer(Player player);
	
	void updatePlayer(Player player);
}
