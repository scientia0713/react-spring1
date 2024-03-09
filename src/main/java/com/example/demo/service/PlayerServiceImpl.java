package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerRepository repository;
	
	@Override
	public void insertPlayer(Player player) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(player);
	}

	@Override
	public void updatePlayer(Player player) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(player);
	}

	@Override
	public Iterable<Player> selectAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	}

}
