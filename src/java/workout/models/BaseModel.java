/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ceckles
 */
public class BaseModel {

    protected Date date = new Date();
    protected Long id = new Date().getTime();
    protected String name;
    protected String description;

    
    public BaseModel() {
    }
    
    public String getDescription() {
        return description;
    }


    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

}
