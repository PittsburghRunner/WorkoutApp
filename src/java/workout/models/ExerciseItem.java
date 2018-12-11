/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

/**
 *
 * @author christopher.eckles
 */
public class ExerciseItem extends BaseModel {

    private Long muscleId;

    public ExerciseItem(Long id, String name, Long muscleId) {
        this.id = id;
        this.name = name;
        this.muscleId = muscleId;
    }

    public Long getMuscleId() {
        return muscleId;
    }

}
