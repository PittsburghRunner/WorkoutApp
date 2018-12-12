/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.controls;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import workout.models.Trainee;

/**
 *
 * @author ceckles
 */
@ManagedBean
@RequestScoped
public class TraineeController 
{
  private Trainee newTrainee;
 
  public TraineeController() {
  }

  public Trainee getTrainee() {
    return newTrainee;
  }
  public void setTrainee(Trainee newTrainee) {
    this.newTrainee = newTrainee;
  }
    
}