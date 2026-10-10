package com.karimcoding.workoutloggingapp.beans;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TrainingSession {

    private final String sessionName;
    private String sessionNote;

    public TrainingSession(String sessionName){
        this.sessionName = sessionName;
    }

    private final List<Exercise> Exercises = new ArrayList<>();

    public void addExercise(String exName){
        Exercises.add(new Exercise(exName));
    }
}