package com.api.jogo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import com.api.jogo.entity.enums.BattleResult;

@Entity
@Table(name = "battles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Battle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "attacker_empire_id")
    private Empire attackerEmpire;

    @ManyToOne
    @JoinColumn(name = "defender_empire_id")
    private Empire defenderEmpire;

    private int attackerStrength;
    private int defenderStrength;

    @Enumerated(EnumType.STRING)
    private BattleResult result;

    private LocalDateTime timestamp = LocalDateTime.now();
}
