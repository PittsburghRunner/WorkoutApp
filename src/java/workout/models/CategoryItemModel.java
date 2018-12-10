/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.models;

import java.util.LinkedList;

/**
 *
 * @author christopher.eckles
 */
public class CategoryItemModel {
    private String categoryItemName;
    private LinkedList<ExerciseItem> exerciseItemModel;

    public String getCategoryItemName() {
        return categoryItemName;
    }

    public void setCategoryItemName(String categoryItemName) {
        this.categoryItemName = categoryItemName;
    }

    public LinkedList<ExerciseItem>  getExerciseItemModel() {
        return exerciseItemModel;
    }

    public void setExerciseItemModel(LinkedList<ExerciseItem> exerciseItemModel) {
        this.exerciseItemModel = exerciseItemModel;
    }
}
