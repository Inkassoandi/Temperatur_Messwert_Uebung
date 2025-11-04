import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vorarlberg extends Bundesland{

    String name;
    public Vorarlberg(String city, double tempHigh, double tempLow, LocalDate measurementDate) {
        super(city, tempHigh, tempLow, measurementDate);
        name = "Vorarlberg";
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format(
                "%s - %s: am %s betrugen die Höchst- und Tiefsttemperaturen %.1f°C und %.1f°C",
                name, city, measurementDate.format(formatter), tempHigh, tempLow);
    }
}
