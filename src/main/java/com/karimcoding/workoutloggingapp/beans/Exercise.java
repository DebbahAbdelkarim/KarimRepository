package com.karimcoding.workoutloggingapp.beans;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  final String exerciseName;
    private  String ExerciseNote;

    @OneToMany
    private final List<TrainingSet> trainingSets = new ArrayList<>();

    public Exercise (String exerciseName) {
        this.exerciseName = exerciseName;
    }

    // This method is only used to declare the initial subset in a set
    public void AddSet (int reps, int weight) {
        trainingSets.add(new TrainingSet(reps, weight));
    }
}