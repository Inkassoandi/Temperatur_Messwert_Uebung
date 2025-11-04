import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {




    public static List<Bundesland> readMeasurements(String filename) {
        List<Bundesland> allMeasurements = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(filename))){
                String line;
                while ((line = br.readLine()) != null) {
                    allMeasurements.add(DataFactory.bundeslandFactory(line));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
      return allMeasurements;
    }




}

