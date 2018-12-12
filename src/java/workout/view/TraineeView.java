/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.view;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import workout.models.Trainee;

/**
 *
 * @author ceckles
 */
@ManagedBean(name = "traineeView")
@SessionScoped
public class TraineeView implements Serializable {

    private static final long serialVersionUID = 1l;

    @ManagedProperty("#{name}")
    private static String name;
    
    @ManagedProperty("#{age}")
    private static String age;
    
    private Trainee trainee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public  Trainee getTrainee() {
        return trainee;
    }

    public  void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    
    
    public String save(Trainees trainees) throws IOException {
        Map<String, String> params = FacesContext.getCurrentInstance().
                getExternalContext().getRequestParameterMap();
        String i = params.get("i");

        if (trainee == null) {
            trainee = new Trainee(name, new Integer(age));
            trainees.addTrainee(trainee);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Welcome " + name + "! Your age is set to " + age + "."));
        } else {
            trainee.update(name, age);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Updated, " + name + "! Your age is now set to " + age + "."));
        }

        if (i.equals("2")) {
            return "exercise.xhtml?facesRedirect=true";

        }
        return null;
    }

    public boolean isRegistered() {
        return (trainee != null);
    }

}
