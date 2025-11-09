import java.util.Comparator;

public class LowToHighTempComoarator implements Comparator<Bundesland> {
    @Override
    public int compare(Bundesland o1, Bundesland o2) {
        return (int) (o1.getTempLow() - o2.getTempLow());
    }
}
