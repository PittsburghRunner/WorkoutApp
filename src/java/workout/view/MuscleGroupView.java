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
import javax.faces.bean.ViewScoped;
import workout.controls.MuscleGroupService;
import workout.models.ExerciseItem;
import workout.models.Muscle;
import workout.models.MuscleGroup;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "muscleGroupView")
@ViewScoped
public class MuscleGroupView implements Serializable {

    private List<MuscleGroup> muscleGroups;
    private List<Muscle> muscles;
    private List<ExerciseItem> exerciseItems;


    @ManagedProperty("#{muscleGroupService}")
    private MuscleGroupService muscleGroupService = new MuscleGroupService();

    /**
     *
     * 
     */
    @PostConstruct
    public void init() {
          muscleGroups =  muscleGroupService.getMuscleGroups();
          muscles = muscleGroupService.getMuscles();
          exerciseItems = muscleGroupService.getExerciseItems();
    }

    public List<MuscleGroup> getMuscleGroups() {
        return muscleGroups;
    }

    public MuscleGroupService getMuscleGroupService() {
        return muscleGroupService;
    }

    public void setMuscleGroupService(MuscleGroupService muscleGroupService) {
        this.muscleGroupService = muscleGroupService;
    }
    
    
}
