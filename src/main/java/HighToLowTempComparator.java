import java.util.Comparator;

public class HighToLowTempComparator implements Comparator<Bundesland> {
    @Override
    public int compare(Bundesland o1, Bundesland o2) {
        return (int) (o2.getTempHigh() - o1.getTempHigh());
    }
}
