import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {



    // Lesen und speichern eines Files in einer Liste von Bundesländern
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


    /*
    Eine Liste in ein neues File schreiben.
    Da man ja nicht weiß, welches Objekt(Bundesland) die übergebene Liste enthalten wird,
    deklaren wir die übergebene Liste als eine, die Objekte enhält, welche unterklassen von Bundesland sind.
    das mchen wir mit: List<? extends Bundesland>
     */

    public static void writeMeasurements(List<? extends Bundesland> mesasurementsList, String filename) {
        File file = new File(filename);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for(Bundesland measurement : mesasurementsList){
                bw.write(measurement.toString());
                bw.write(System.lineSeparator());
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }




}

