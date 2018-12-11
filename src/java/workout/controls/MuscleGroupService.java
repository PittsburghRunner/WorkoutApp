/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout.controls;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import workout.models.BaseModel;
import workout.models.ExerciseItem;
import workout.models.Muscle;
import workout.models.MuscleGroup;
import workout.utils.CompareBaseModel;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "muscleGroupService")
@ApplicationScoped
public class MuscleGroupService {

    //   public static final String WORKOUT_DATA = "C:\\Users\\christopher.eckles\\Documents\\NetBeansProjects\\WorkoutApp\\resources\\DataImport.xlsx";
    public static final String WORKOUT_DATA = "/Users/ceckles/NetBeansProjects/WorkoutApp/resources/DataImport.csv";

    private List<MuscleGroup> muscleGroups = new LinkedList();
    private List<Muscle> muscles = new LinkedList();
    private List<ExerciseItem> exerciseItems = new LinkedList();

    public MuscleGroupService() {
        try (Reader in = new FileReader(WORKOUT_DATA)) {

            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
//.withHeader("MuscleGroup", "Muscle", "ExerciseItem")
            for (CSVRecord record : records) {
                String muscleGroup = "";
                String muscle = "";
                String exerciseItem = "";
                Long id = 0l;
                if (record.get("MuscleGroup") != null) {
                    muscleGroup = record.get("MuscleGroup");
                }
                if (record.get("Muscle") != null) {
                    muscle = record.get("Muscle");
                }
                if (record.get("ExerciseItem") != null) {
                    exerciseItem = record.get("ExerciseItem");
                }

                id = record.getRecordNumber();
                if(CompareBaseModel.getByName(muscleGroup, muscleGroups) == null){
                   muscleGroups.add(new MuscleGroup(id, muscleGroup));
                }
                if(CompareBaseModel.getByName(muscle, muscles) == null){
                muscles.add(new Muscle(id, muscle, CompareBaseModel.getByName(muscleGroup, muscleGroups).getId()));
                }
                if(CompareBaseModel.getByName(exerciseItem, exerciseItems) == null){
                exerciseItems.add(new ExerciseItem(id, exerciseItem, CompareBaseModel.getByName(muscle, muscles).getId()));
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MuscleGroupService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MuscleGroupService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<MuscleGroup> getMuscleGroups() {
        return muscleGroups;
    }

    public List<Muscle> getMuscles() {
        return muscles;
    }

    public List<ExerciseItem> getExerciseItems() {
        return exerciseItems;
    }

}
