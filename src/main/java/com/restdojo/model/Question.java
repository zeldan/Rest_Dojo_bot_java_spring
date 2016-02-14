package com.restdojo.model;

import com.restdojo.model.type.Location;
import com.restdojo.model.type.QuestionType;
import com.restdojo.model.type.Suspect;
import com.restdojo.model.type.Weapon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private QuestionType type;
    private Location location;
    private Suspect suspect;
    private Weapon weapon;
}
