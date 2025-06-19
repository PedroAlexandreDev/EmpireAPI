package com.api.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.jogo.entity.Empire;

@Repository
public interface EmpireRepositoy extends JpaRepository<Empire, Long> {

    
}