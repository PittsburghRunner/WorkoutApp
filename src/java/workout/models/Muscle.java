    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "muscle")
@ViewScoped
public class Muscle extends BaseModel{
    
    Long muscleGroupId;

     public Muscle(Long id, String name, Long muscleGroupId){
         this.id = id;
         this.name = name;
         this.muscleGroupId = muscleGroupId;
     }
     
     
    public Long getMuscleGroupId() {
        return muscleGroupId;
    }
    
}
