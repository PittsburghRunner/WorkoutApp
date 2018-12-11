/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author christopher.eckles
 */

@ManagedBean(name = "muscleGroup")
@ViewScoped
public class MuscleGroup extends BaseModel implements Serializable {


    public MuscleGroup(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
