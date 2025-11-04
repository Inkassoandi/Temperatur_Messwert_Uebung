import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    @Test
    void readMeasurements() {

        List<Bundesland> allMeasurements = (FileHandler.readMeasurements("temperaturmessungen_oesterreich.txt"));

        System.out.println(allMeasurements.size());
        System.out.println(allMeasurements.getFirst());
        System.out.println(allMeasurements.get(4));




    }
}