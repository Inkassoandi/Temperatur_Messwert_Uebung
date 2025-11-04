import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataFactory {

    public static Bundesland bundeslandFactory(String line){
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  --> nicht notwendig wenn der data[4] String mit "LocaleDate.parse" geparsed wird

        line = line.strip();
        String[] data = line.split(";\\s*");    // ";\\s*" sorgt dafür das alle Leerzeichen nach dem ";" automatisch verschwinden (ist bei Zeile 20 relevant)

        String bundesland = data[0];
        String city = data[1];

        double highTemperature = Double.parseDouble(data[2].replace("°C",""));
        double lowTemperature = Double.parseDouble(data[3].replace("°C",""));

        // das Leerzeichen, vor der ersten Zahl des Datums, hat mi ca 20 Minuten gekostet!?!  kekw
        // data[4] = data[4].trim();  ---> ned nötig wenn man bei split  ";\\s*" verwendet.
        LocalDate dateOfMeasurement = LocalDate.parse(data[4]);



        return switch (bundesland) {
            case "Wien" -> new Wien(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Niederösterreich" -> new Niederösterreich(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Oberösterreich" -> new Oberösterreich(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Burgenland" -> new Burgenland(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Steiermark" -> new Steiermark(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Kärnten" -> new Kärnten(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Salzburg" -> new Salzburg(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Tirol" -> new Tirol(city, highTemperature, lowTemperature, dateOfMeasurement);
            case "Vorarlberg" -> new Vorarlberg(city, highTemperature, lowTemperature, dateOfMeasurement);

            default -> throw new IllegalStateException("Unexpected value: " + bundesland);
        };

    }


}
