package com.api.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.jogo.entity.Battle;

@Repository
public interface BattleRepository extends JpaRepository<Battle, Long> {

    
}
