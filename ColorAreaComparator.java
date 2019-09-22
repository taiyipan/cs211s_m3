import java.util.Comparator;

public class ColorAreaComparator implements Comparator<Polygon>  {

    @Override
    public int compare(Polygon obj1, Polygon obj2) {

        int colorCompare = (obj1.getColor().compareTo(obj2.getColor()));

        if (colorCompare == 0) {
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
        else {
            return colorCompare;

        }

    }
}
