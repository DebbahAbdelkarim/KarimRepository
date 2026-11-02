package com.karimcoding.workoutloggingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SubSet {

    @Id
    int id;

    public SubSet (int repetitions, int weight) {
        this.repetitions = repetitions;
        this.weight = weight;
    }

    int repetitions;
    int weight;
}