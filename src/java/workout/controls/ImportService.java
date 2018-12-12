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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
import workout.models.ExerciseItem;
import workout.models.Muscle;
import workout.models.MuscleGroup;
import workout.utils.CompareBaseModel;

/**
 *
 * @author christopher.eckles
 */
@ManagedBean(name = "importService")
@ApplicationScoped
public class ImportService {

    //   public static final String WORKOUT_DATA = "C:\\Users\\christopher.eckles\\Documents\\NetBeansProjects\\WorkoutApp\\resources\\DataImport.xlsx";
    public static final String WORKOUT_DATA = "/Users/ceckles/NetBeansProjects/WorkoutApp/resources/DataImport.csv";

    private LinkedList<MuscleGroup> muscleGroups = new LinkedList();
    private LinkedList<Muscle> muscles = new LinkedList();
    private LinkedList<ExerciseItem> exerciseItems = new LinkedList();

    public ImportService() {
        System.out.println("Importing Data");
        try (Reader in = new FileReader(WORKOUT_DATA)) {

            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
//.withHeader("MuscleGroup", "Muscle", "ExerciseItem")
            for (CSVRecord record : records) {
                String muscleGroup = null;
                String muscle = null;
                String exerciseItem = null;
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
                if (StringUtils.isNotBlank(muscleGroup)) {
                    if (CompareBaseModel.getByName(muscleGroup, muscleGroups) == null) {
                        muscleGroups.add(new MuscleGroup(id, muscleGroup));
                    }
                    if (StringUtils.isNotBlank(muscle)) {
                        if (CompareBaseModel.getByName(muscle, muscles) == null) {
                            muscles.add(new Muscle(id, muscle, CompareBaseModel.getByName(muscleGroup, muscleGroups).getId()));
                        }
                        if (StringUtils.isNotBlank(exerciseItem) && CompareBaseModel.getByName(exerciseItem, exerciseItems) == null) {
                            exerciseItems.add(new ExerciseItem(id, exerciseItem, CompareBaseModel.getByName(muscle, muscles).getId()));
                        }
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LinkedList<MuscleGroup> getMuscleGroups() {
        return muscleGroups;
    }

    public LinkedList<Muscle> getMuscles() {
        return muscles;
    }

    public LinkedList<ExerciseItem> getExerciseItems() {
        return exerciseItems;
    }

}
