/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "trainee")
@SessionScoped
public class Trainee extends BaseModel{
    Integer age;
    
    
    public Trainee(String name, int age){
        this.id = (new Date()).getTime();
        this.name = name;
        this.age=age;
        
    }

    public int getAge() {
        return age;
    }
    
    public void update(String name, String age){
        if(name != null){
            this.name= name;
        }
        if(age != null){
            this.age = new Integer(age);
        }
    }
    
}
