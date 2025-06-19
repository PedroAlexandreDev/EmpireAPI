package com.api.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.jogo.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    
}
