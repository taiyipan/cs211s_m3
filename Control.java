import java.util.ArrayList;
import java.util.Collections;
/** Driver class for module2 */
public class Control {
	public static void main(String[] args) {
		//create ArrayList of Polygon class
		ArrayList<Polygon> shapes= new ArrayList<>();

		//populate shapes with children objects
		shapes.add(new Polygon(5, 10, Color.RED)); // M2 HOMEWORK ENUM USE
		shapes.add(new Triangle(2, 5, Color.MAGENTA)); // M2 HOMEWORK ENUM USE
		((Triangle) shapes.get(1)).setBase(3);
		shapes.add(new Circle(3, Color.YELLOW)); // M2 HOMEWORK ENUM USE
		((Circle) shapes.get(2)).setRadius(4);
		shapes.add(new Rectangle(4, 2, Color.BLUE)); // M2 HOMEWORK ENUM USE
		((Rectangle) shapes.get(3)).setWidth(3);
		shapes.add(new Square(6, Color.CYAN)); // M2 HOMEWORK ENUM USE
		((Square) shapes.get(4)).setSide(5);

		//print out each shape
		System.out.printf("Before sorting %d objects:\n", Polygon.getCount()); // M2 HOMEWORK STATIC
		for (Polygon p: shapes) {
			System.out.println(p);
		}

		//sort shapes
		Collections.sort(shapes);

		//print out new sorted order
		System.out.printf("\nAfter sorting %d objects:\n", Polygon.getCount()); // M2 HOMEWORK STATIC
		for (Polygon p: shapes) {
			System.out.println(p);
		}

		Collections.sort(shapes, new AreaSidesComparator()); //M3 USING COMPARATOR
		System.out.println(shapes);

		Collections.sort(shapes, new SidesAreaComparator()); //M3 USING COMPARATOR
		System.out.println(shapes);

		Collections.sort(shapes, new ColorAreaComparator()); //M3 USING COMPARATOR
		System.out.println(shapes);
	}
}
