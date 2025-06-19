package com.api.jogo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "empires")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Empire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int level = 1;

    @Embedded
    private Features features;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    
    @OneToMany(mappedBy = "empire", cascade = CascadeType.ALL)
    private List<Building> buildings;

    @OneToMany(mappedBy = "empire", cascade = CascadeType.ALL)
    private List<ArmyUnit> armyUnits;

    @OneToMany(mappedBy = "attackerEmpire", cascade = CascadeType.ALL)
    private List<Battle> battles;

}
