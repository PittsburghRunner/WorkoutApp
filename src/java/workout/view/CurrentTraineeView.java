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
import javax.faces.bean.SessionScoped;
import workout.controls.ImportService;
import workout.models.ExerciseItem;
import workout.models.Muscle;
import workout.models.MuscleGroup;
import workout.models.Trainee;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "currentTraineeView")
@SessionScoped
public class CurrentTraineeView implements Serializable {

    private Trainee trainee; 
   
    /**
     *
     * 
     */
    @PostConstruct
    public void init() {
          
    }

  
    
    
}
