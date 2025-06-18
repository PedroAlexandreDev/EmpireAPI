package com.api.jogo.entity;

import com.api.jogo.entity.enums.ArmyUnitType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "army_units")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArmyUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private ArmyUnitType type;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "empire_id")
    private Empire empire;
}
