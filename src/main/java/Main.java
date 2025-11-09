import java.util.List;

public class Main {
    public static void main(String[] args) {


        /*
         * Hier wird die FileHandler Methode angewendet um mit ihr eine Texdatei von Messungen
         * einzuselen und in einer Liste von "Bundesländern abzuspeichern.
         */
        List<Bundesland> tempMessungen = (FileHandler.readMeasurements("temperaturmessungen_oesterreich.txt"));
        tempMessungen.forEach(System.out::println);
        System.out.println();



        // Aus einer Liste alle Kärntner Messungen in eine neue Liste Speichern
        List <Kärnten> tempKärnten = SortBy.getKärnten(tempMessungen);
        System.out.println("Alle Messungen aus Kärnten:");
        tempKärnten.forEach(System.out::println);
        System.out.println();


        // anwendung eines Comparator, sortierung nach Höchster Temperatur.
        // !!!  keine eigene Methode notwendig, einfach .sort(new "Comparator")
        tempKärnten.sort(new HighToLowTempComparator());
        System.out.println("Temperaturen von Höchste nis Niedrigste:");
        tempKärnten.forEach(System.out::println);
        System.out.println();

        // sortieren nach der niedrigsten Temperatur
        tempKärnten.sort(new LowToHighTempComoarator());
        System.out.println("Temperaturen von Niedrigste bis Höchste:");
        tempKärnten.forEach(System.out::println);
        System.out.println();

        // Ausgabe des höchsten und niedrigsten Messwerte's
        System.out.println(SortBy.getHighestTemp(tempMessungen));
        System.out.println(SortBy.getLowestTemp(tempMessungen));


    }
}
