package com.karimcoding.workoutloggingapp.beans;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.HashMap;
import java.util.Map;

@Entity
public class TrainingSet {

    @Id
    int id;

    @ElementCollection
    Map<Integer,Integer> subsets = new HashMap<>();

    protected TrainingSet() {
    }

    public TrainingSet (int initialReps, int initialWeight){
        this.subsets.put(initialReps, initialWeight);
    }

    public void addSubSet (int reps, int weight){
        subsets.put(reps,weight);
    }
}