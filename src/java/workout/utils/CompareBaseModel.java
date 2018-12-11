/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.utils;

import java.util.List;
import workout.models.BaseModel;

/**
 *
 * @author ceckles
 */
public class CompareBaseModel {
       public static BaseModel getByName(String name, List<? extends BaseModel> baseModel) {

        for (BaseModel item : baseModel) {
            if (item.getName().equals(name)) {
                return item;
            }
        }

        return null;
    }

    public static BaseModel getById(Long id, List<? extends BaseModel> baseModel) {

        for (BaseModel item : baseModel) {
            if (item.getId().equals(id)) {
                return item;
            }
        }

        return null;
    }
}
