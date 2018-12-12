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
@ManagedBean(name = "trainees")
@ApplicationScoped
public class Trainees implements Serializable {

    private static LinkedList<Trainee> trainees = new LinkedList();

   
    /**
     *
     *
     */
    @PostConstruct
    public void init() {

    }

    public static LinkedList<Trainee> getTrainees() {
        return trainees;
    }
    
    
    
    public static boolean addTrainee(Trainee trainee) {
        if (!trainees.contains(trainee)) {
            trainees.add(trainee);
            return true;
        }
        return false;
    }

    public static boolean removeTrainee(Trainee trainee) {
        if (trainees.contains(trainee)) {
            trainees.remove(trainee);
            return true;
        }
        return false;
    }

}
