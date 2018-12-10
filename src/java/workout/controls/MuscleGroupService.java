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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import workout.models.ExerciseItem;
import workout.models.Muscle;
import workout.models.MuscleGroup;

/**
 *
 * @author christopher.eckles
 */
public class MuscleGroupService {

    public static final String WORKOUT_DATA = "C:\\Users\\christopher.eckles\\Documents\\NetBeansProjects\\WorkoutApp\\resources\\DataImport.xlsx";
    List<MuscleGroup> muscleGroups;
    List<Muscle> muscles;
    List<ExerciseItem> exercises;

      

    public MuscleGroupService() throws FileNotFoundException, IOException {

        try (Reader in = new FileReader(WORKOUT_DATA)) {
            HashMap<String, String> muscleGroups = new HashMap();
            HashMap<String, String> muscles = new HashMap();
            HashMap<String, String> exercises = new HashMap();
            
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);

            for (CSVRecord record : records) {

                String muscleGroup = record.get("MuscleGroup");
                String muscle = record.get("Muscle");
                String exersizeItem = record.get("ExcerciseItem");

                muscleGroups.put(muscleGroup, "");
                muscles.put(muscle, muscleGroup);
                exercises.put(exersizeItem, muscle);
            }

        }
        
        
    }

    public List<MuscleGroup> getMuscleGroups() {
        return muscleGroups;
    }

    public List<Muscle> getMuscles() {
        return muscles;
    }

    public List<ExerciseItem> getExercises() {
        return exercises;
    }


    
}
