import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class BundeslandTest {
    @Test
    void testWien() {
        Wien land1 = new Wien("1.Bezirk", 21.2, 10.8, LocalDate.of(2025,10, 7));
        land1.toString();
        Assertions.assertEquals("Wien - 1.Bezirk: am 07/10/2025 betrugen die Höst- und Tiefsttemperaturen 21,2°C und 10,8°C", land1.toString());

        Niederösterreich land2 = new Niederösterreich("Wr. Neustadt", 32, 8.2, LocalDate.of(2025,10, 22));
        land2.toString();
        Assertions.assertEquals("Niederösterreich - Wr. Neustadt: am 22/10/2025 betrugen die Höst- und Tiefsttemperaturen 32,0°C und 8,2°C", land2.toString());

        Vorarlberg land9 = new Vorarlberg("Feldkirch", 33,13.9, LocalDate.of(2025,10, 22));
        land9.toString();
        Assertions.assertEquals("Vorarlberg - Feldkirch: am 22/10/2025 betrugen die Höst- und Tiefsttemperaturen 33,0°C und 13,9°C", land9.toString());
    }

}