/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name="muscleGroups")
@ViewScoped
public class MuscleGroup implements Serializable {
    String muscleGroup;
    LinkedList<Muscle> muscles;
    
    MuscleGroup(String name, ArrayList<String> muscles){
        muscleGroup = name;
        
    }
}