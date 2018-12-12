/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import workout.utils.Helpers;

/**
 *
 * @author christopher.eckles
 */
public class WorkoutHistory extends BaseModel implements Serializable {



    private static Long traineeModelId;
    private static Long exerciseItemId;
    
    private static LinkedList<Set> sets;

    public WorkoutHistory(Long traineeModelId, Long exerciseItemId) {
        Long time = (new Date()).getTime();
        this.id = Helpers.concatenateLong(traineeModelId + time);
    }

    
    


    public Long getTraineeModelId() {
        return traineeModelId;
    }

    public Long getExerciseItemId() {
        return exerciseItemId;
    }

    
    
}
