/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.view;

import java.io.Serializable;
import java.util.LinkedList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import workout.models.BaseModel;
import workout.models.Set;
import workout.models.WorkoutHistory;
import workout.utils.CompareBaseModel;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "workoutView")
@ApplicationScoped
public class WorkoutView implements Serializable {

    private Long traineeModelId;
    private Long exerciseItemId;
    private LinkedList<Set> sets;

    private LinkedList<WorkoutHistory> workoutHistory;

    /**
     *
     *
     */
    @PostConstruct
    public void init() {

    }

    public Long getTraineeModelId() {
        return traineeModelId;
    }

    public void setTraineeModelId(Long traineeModelId) {
        this.traineeModelId = traineeModelId;
    }

    public Long getExerciseItemId() {
        return exerciseItemId;
    }

    public void setExerciseItemId(Long exerciseItemId) {
        this.exerciseItemId = exerciseItemId;
    }

    public LinkedList<Set> getSets() {
        return sets;
    }
    
    public LinkedList<? extends BaseModel> getWorkoutHistoryForUser(Long id) {
            return CompareBaseModel.getAllById(id,workoutHistory);
    }

    public void setSets(LinkedList<Set> sets) {
        this.sets = sets;
    }

    public LinkedList<WorkoutHistory> getWorkoutHistory() {
        return workoutHistory;
    }

    public void setWorkoutHistory(LinkedList<WorkoutHistory> workoutHistory) {
        this.workoutHistory = workoutHistory;
    }
    
    

}
