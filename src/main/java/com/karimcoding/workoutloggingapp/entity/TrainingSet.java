package com.karimcoding.workoutloggingapp.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TrainingSet extends Activity {

    @Id
    int id;

    @ElementCollection
    List<SubSet> subSets = new ArrayList<>();

    protected TrainingSet() {
    }

    public TrainingSet (int initialReps, int initialWeight){
        this.subSets.add(new SubSet(initialReps,initialWeight));
    }

    public void addSubSet (int reps, int weight){
        subSets.add(new SubSet(reps,weight));
    }
}