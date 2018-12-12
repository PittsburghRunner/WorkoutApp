/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import java.util.Date;
import workout.interfaces.Timed;
import workout.interfaces.Weightable;
import workout.utils.Converters;

/**
 *
 * @author christopher.eckles
 */
public class Set extends BaseModel implements Timed, Weightable{
    private static int repCount;
    private static Double weightInPounds;
    private static Date endTime;
    
    public Set(int repCount, Double weight){
        this.repCount = repCount;
        this.weightInPounds = weight;
    }
    
    public int getRepCount() {
        return repCount;
    }

    public static Date getEndTime() {
        return endTime;
    }

    public static void setEndTime() {
        Set.endTime = new Date();
    }

    @Override
    public Date getDuration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeightInPounds() {
        return weightInPounds;
    }

    @Override
    public double getWeightInKiloGrams() {
        return Converters.poundsToKilos(weightInPounds);
    }
    
}
