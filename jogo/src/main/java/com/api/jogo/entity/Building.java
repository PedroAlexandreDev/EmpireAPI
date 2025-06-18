package com.api.jogo.entity;

import com.api.jogo.entity.enums.BuildingType;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "buildings")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private BuildingType type;

    private int level = 1;

    @ManyToOne
    @JoinColumn(name = "empire_id")
    private Empire empire;
    
}

