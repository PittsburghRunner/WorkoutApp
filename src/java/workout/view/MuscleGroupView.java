/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.view;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ApplicationScoped;
import workout.controls.importService;
import workout.models.ExerciseItem;
import workout.models.Muscle;
import workout.models.MuscleGroup;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "muscleGroupView")
@ApplicationScoped
public class MuscleGroupView implements Serializable {

    private List<MuscleGroup> muscleGroups;
    private List<Muscle> muscles;
    private List<ExerciseItem> exerciseItems;


    @ManagedProperty("#{importService}")
    private importService importService;

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

    public importService getImportService() {
        return importService;
    }

    public void setImportService(importService importService) {
        this.importService = importService;
    }
    
    
}
