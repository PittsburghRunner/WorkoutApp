/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

/**
 *
 * @author ceckles
 */
public class BaseModel {

    protected Long id;
    protected String name;
    protected String description;

    public String getDescription() {
        return description;
    }

    public BaseModel() {
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
