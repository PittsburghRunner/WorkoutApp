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
public class SetModel extends BaseModel{
    private static int repCount;
    private static float weight;
    
    public SetModel(int repCount, float weight){
        this.repCount = repCount;
        this.weight = weight;
    }
    
    public int getRepCount() {
        return repCount;
    }

    public float getWeight() {
        return weight;
    }
    
    
}
