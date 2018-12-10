/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.view;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import workout.controls.MuscleGroupService;
import workout.models.MuscleGroup;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name="sampleData")
@ViewScoped
public class MuscleGroupView implements Serializable {
     
    private Collection<MuscleGroup> muscleGroups;
     
    @ManagedProperty("#{muscleGroup}")
    private MuscleGroupService service;
    
@PostConstruct
    public void init() {
        try {
            service = new MuscleGroupService();
        } catch (IOException ex) {
            Logger.getLogger(MuscleGroupView.class.getName()).log(Level.SEVERE, null, ex);
        }
        muscleGroups = service.getMuscleGroups();
    }
     
    public Collection<MuscleGroup> getMuscleGroups() {
        return muscleGroups;
    }
 
    public void setService(MuscleGroupService service) {
        this.service = service;
    }
}