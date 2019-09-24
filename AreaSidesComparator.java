import java.util.Comparator;
/** Compare area first, if equal, then compare sides */
public class AreaSidesComparator implements Comparator<Polygon> {

    @Override
    public int compare(Polygon obj1, Polygon obj2) {

        int areaComparison = obj1.compareTo(obj2);

        if (areaComparison == 0) {
            if (obj1.getSides() > obj2.getSides()) {
                return 1;
            } else if (obj1.getSides() < obj2.getSides()) {
                return -1;
            } else {
                return 0;
            }
        } else if (areaComparison > 0) {
            return 1;
        }
        return -1;
    }
}
