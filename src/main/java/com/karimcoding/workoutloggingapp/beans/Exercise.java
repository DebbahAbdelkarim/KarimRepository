package com.karimcoding.workoutloggingapp.beans;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Exercise {

    private  final String exerciseName;
    private  String ExerciseNote;

    private final List<TrainingSet> trainingSets = new ArrayList<>();

    public Exercise (String exerciseName) {
        this.exerciseName = exerciseName;
    }

    // This method is only used to declare the initial subset in a set
    public void AddSet (int reps, int weight) {
        trainingSets.add(new TrainingSet(reps, weight));
    }
}