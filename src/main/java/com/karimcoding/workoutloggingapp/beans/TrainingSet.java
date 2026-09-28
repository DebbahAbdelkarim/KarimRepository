package com.karimcoding.workoutloggingapp.beans;

import java.util.HashMap;
import java.util.Map;

public class TrainingSet {

    Map<Integer,Integer> subsets = new HashMap<>();

    public TrainingSet (int initialReps, int initialWeight){
        this.subsets.put(initialReps, initialWeight);
    }

    public void addSubSet (int reps, int weight){
        subsets.put(reps,weight);
    }
}