import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DataFactoryTest {


    @Test
    void createDataFactory() {

        List<Bundesland> newList = new ArrayList<>();

        String line = "Burgenland; Mattersburg; 27.0°C; 13.3°C; 2025-10-17";
        String line2 = "Kärnten; Hermagor; 34.6°C; 21.8°C; 2025-10-24";
        String line3 = "Steiermark; Leoben; 3.2°C; -8.5°C; 2025-10-14";
        String line4 = "Tirol; Imst; 23.3°C; 15.8°C; 2025-10-19";

        /*
         * "bundeslandFactory" erstellt aus einem String ein Bundesland
         *  newList ist eine Liste von Bundesländern und mit ".add()" fügen wir ein neues Bundesland hinzu
         *  wir haben aber nur einen "String", in dem Fall "line" mit dem Inhalt "Burgenland; Mattersburg; 27.0°C; 13.3°C; 2025-10-17"
         *   da "bundeslandFactory" aus einem "String" ein "Bundesland" macht können wir Sie direkt in ".add()" verwenden
         *  !learning! → Das ist möglich, weil es eine "static" Methode ist. Wir können sie verwenden ohne zuerst eine "new DataFactory" initialisieren zu müssen
         */


        newList.add(DataFactory.bundeslandFactory(line));
        newList.add(DataFactory.bundeslandFactory(line2));
        newList.add(DataFactory.bundeslandFactory(line3));
        newList.add(DataFactory.bundeslandFactory(line4));


        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        System.out.println(newList.get(2));
        System.out.println(newList.get(3));


    }


}