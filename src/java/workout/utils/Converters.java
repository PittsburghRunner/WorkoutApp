/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.utils;

/**
 *
 * @author christopher.eckles
 */

public class Converters {
    public static final double POUNDS_TO_KILOS_MULTIPLIER = 0.454;
    public static final double KILOS_TO_POUNDS_MULTIPLIER = 2.205;;

 public double poundsToKilos(double pounds){
     return pounds*POUNDS_TO_KILOS_MULTIPLIER;
    }
 
  public double kilosToPounds (double kilos){
     return kilos*KILOS_TO_POUNDS_MULTIPLIER;
    }
}
