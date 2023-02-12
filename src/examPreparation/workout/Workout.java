package examPreparation.workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (getExerciseCount() < exerciseCount) {
            exercises.add(exercise);

        }
    }

    public boolean removeExercise(String name, String muscle) {
        for (var e : exercises) {
            if (name.equals(e.getName()) && muscle.equals(e.getMuscle())) {
                exercises.remove(e);
                return true;
            }
        }
        return false;
    }

    public Exercise getExercise(String name, String muscle) {
        for (var e:exercises) {
            if (name.equals(e.getName()) && muscle.equals(e.getMuscle())) {
                return e;
            }
        }
        return null;
    }


    public Exercise getMostBurnedCaloriesExercise() {
        return exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).get();
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics() {
        return "Workout type: "+type+System.lineSeparator()
                + exercises.stream().map(Exercise::toString).collect(Collectors.joining(System.lineSeparator()));
    }

}

