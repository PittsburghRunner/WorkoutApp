/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.view;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ApplicationScoped;
import workout.controls.ImportService;
import workout.models.ExerciseItem;
import workout.models.Muscle;
import workout.models.MuscleGroup;
import workout.models.WorkoutHistory;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "exerciseView")
@ApplicationScoped
public class ExerciseView implements Serializable {

    private LinkedList<MuscleGroup> muscleGroups;
    private LinkedList<Muscle> muscles;
    private LinkedList<ExerciseItem> exerciseItems;
    
    private LinkedList<WorkoutHistory> workoutHistory;

    @ManagedProperty("#{importService}")
    private ImportService importService;

    /**
     *
     * 
     */
    @PostConstruct
    public void init() {
          muscleGroups =  importService.getMuscleGroups();
          muscles = importService.getMuscles();
          exerciseItems = importService.getExerciseItems();
    }

    public List<MuscleGroup> getMuscleGroups() {
        return muscleGroups;
    }

    public List<Muscle> getMuscles() {
        return muscles;
    }

    public List<ExerciseItem> getExerciseItems() {
        return exerciseItems;
    }

    public ImportService getImportService() {
        return importService;
    }

    public void setImportService(ImportService importService) {
        this.importService = importService;
    }
    
    
}
