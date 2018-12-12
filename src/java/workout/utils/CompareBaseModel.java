/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.utils;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import workout.models.BaseModel;

/**
 *
 * @author ceckles
 */
@ManagedBean(name = "compareBaseModel")
@ApplicationScoped
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
      public static LinkedList<? extends BaseModel> getAllById(Long id, LinkedList<? extends BaseModel> baseModel) {
        LinkedList<BaseModel> newList = new LinkedList();
        for (BaseModel item : baseModel) {
            if (item.getId().equals(id)) {
                newList.add(item);
            }
        }

        return newList;
    }
}
