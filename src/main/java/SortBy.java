import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortBy {


    // erstellen einer Liste mit Messdaten eines spezifischen Bundeslands
    // TODO diese Methoden ist so zu optimieren das man nicht für jedes Bundesland eine eigene benötigt

    public static List<Kärnten> getKärnten(List<Bundesland> incomeList){
        List<Kärnten> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Kärnten")){
                outcomeList.add((Kärnten) object);
            }
        }
        return outcomeList;
    }
    public static List<Steiermark> getSteiermark(List<Bundesland> incomeList){
        List<Steiermark> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Steiermark")){
                outcomeList.add((Steiermark) object);
            }
        }
        return outcomeList;
    }
    public static List<Salzburg> getSalzburg(List<Bundesland> incomeList){
        List<Salzburg> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Salzburg")){
                outcomeList.add((Salzburg) object);
            }
        }
        return outcomeList;
    }
    public static List<Burgenland> getBurgenland(List<Bundesland> incomeList){
        List<Burgenland> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Burgenland")){
                outcomeList.add((Burgenland) object);
            }
        }
        return outcomeList;
    }
    public static List<Wien> getWien(List<Bundesland> incomeList){
        List<Wien> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Wien")){
                outcomeList.add((Wien) object);
            }
        }
        return outcomeList;
    }
    public static List<Niederösterreich> getNiederösterreich(List<Bundesland> incomeList){
        List<Niederösterreich> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Niederösterreich")){
                outcomeList.add((Niederösterreich) object);
            }
        }
        return outcomeList;
    }
    public static List<Oberösterreich> getOberösterreich(List<Bundesland> incomeList){
        List<Oberösterreich> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Oberösterreich")){
                outcomeList.add((Oberösterreich) object);
            }
        }
        return outcomeList;
    }
    public static List<Tirol> getTirol(List<Bundesland> incomeList){
        List<Tirol> outcomeList = new ArrayList<>();
        for(Bundesland object: incomeList){
            if (Objects.equals(object.getName(), "Tirol")){
                outcomeList.add((Tirol) object);
            }
        }
        return outcomeList;
    }
    public static List<Vorarlberg> getVorarlberg(List<Bundesland> incomeList) {
        List<Vorarlberg> outcomeList = new ArrayList<>();
        for (Bundesland object : incomeList) {
            if (Objects.equals(object.getName(), "Vorarlberg")) {
                outcomeList.add((Vorarlberg) object);
            }
        }
        return outcomeList;
    }




    // Ausgabe der Messung mit der höchsten Temperatur
    public static Bundesland getHighestTemp(List<Bundesland> incomeList){
        incomeList.sort(new HighToLowTempComparator());
        return incomeList.getFirst();
        }
    // Ausgabe der Messung mit der niedrigsten Temperatur
    public static Bundesland getLowestTemp(List<Bundesland> incomeList){
        incomeList.sort(new LowToHighTempComoarator());
        return incomeList.getFirst();
    }



    }