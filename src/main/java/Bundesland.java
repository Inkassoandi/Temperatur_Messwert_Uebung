import java.time.LocalDate;

public abstract class Bundesland {

    String city;
    double tempHigh;
    double tempLow;
    LocalDate measurementDate;


    public Bundesland(String city, double tempHigh, double tempLow, LocalDate measurementDate) {
        this.city = city;
        this.tempHigh = tempHigh;
        this.tempLow = tempLow;
        this.measurementDate = measurementDate;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTempHigh() {
        return tempHigh;
    }

    public void setTempHigh(double tempHigh) {
        this.tempHigh = tempHigh;
    }

    public double getTempLow() {
        return tempLow;
    }

    public void setTempLow(double tempLow) {
        this.tempLow = tempLow;
    }

    public LocalDate getMeasurementDate() {
        return measurementDate;
    }

    public void setMeasurementDate(LocalDate measurementDate) {
        this.measurementDate = measurementDate;
    }

    @Override
    public abstract String toString();
}
