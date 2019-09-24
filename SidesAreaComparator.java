import java.util.Comparator;
/** Compare sides first, if equal, then compare area */
public class SidesAreaComparator implements Comparator<Polygon> {

    @Override
    public int compare(Polygon obj1, Polygon obj2) {
        if (obj1.getSides() == obj2.getSides()) {
            if (obj1.getArea() > obj2.getArea()) {
                return 1;
            }
            else if (obj1.getArea() < obj2.getArea()) {
                return -1;
            }
            else {
                return 0;
            }
        }
        else if (obj1.getSides() > obj2.getSides()) {
            return 1;
        }
        return -1;
    }
}
