package com.api.jogo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "empires")
public class Empire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int level = 1;

    @Embedded
    private Features features;

    @OneToMany(mappedBy = "empire", cascade = CascadeType.ALL)
    private List<Building> buildings;

    @OneToMany(mappedBy = "empire", cascade = CascadeType.ALL)
    private List<ArmyUnit> armyUnits;

    @OneToMany(mappedBy = "attackerEmpire", cascade = CascadeType.ALL)
    private List<Battle> battles;

    // Getters e setters...
}
