package com.restdojo.model;

import java.util.List;

import com.restdojo.model.type.Location;
import com.restdojo.model.type.Suspect;
import com.restdojo.model.type.Weapon;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StartGamePayload {
    private int playerId;
    private int countOfPlayers;
    private List<Weapon> weapons;
    private List<Suspect> suspects;
    private List<Location> locations;
}
