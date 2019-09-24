import java.util.ArrayList;
import java.util.Collections;
/** Driver class for module 3 */
public class Control {
	public static void main(String[] args) {
		//create ArrayList of Polygon class
		ArrayList<Polygon> shapes= new ArrayList<>();

		//populate shapes with children objects
		shapes.add(new Polygon.PolygonBuilder().sides(5).area(10).color(Color.RED).build()); // M3 USING BUILDER
		shapes.add(PolygonFactory.newPolygon(Shape.TRIANGLE, Color.MAGENTA)); // M3 USING FACTORY
		((Triangle) shapes.get(1)).setBase(3);
		((Triangle) shapes.get(1)).setHeight(5);
		shapes.add(PolygonFactory.newPolygon(Shape.CIRCLE, Color.YELLOW)); // M3 USING FACTORY
		((Circle) shapes.get(2)).setRadius(1);
		shapes.add(PolygonFactory.newPolygon(Shape.RECTANGLE, Color.BLUE)); // M3 USING FACTORY
		((Rectangle) shapes.get(3)).setLength(4);
		((Rectangle) shapes.get(3)).setWidth(3);
		shapes.add(PolygonFactory.newPolygon(Shape.SQUARE, Color.CYAN)); // M3 USING FACTORY
		((Square) shapes.get(4)).setSide(5);

		//print out each shape
		System.out.printf("Before sorting %d objects:\n", Polygon.getCount()); // M2 HOMEWORK STATIC
		for (Polygon p: shapes) {
			System.out.println(p);
		}

		//sort shapes based on its natural order: area in ascending order
		Collections.sort(shapes);

		//print out new sorted order
		System.out.printf("\nAfter sorting %d objects:\n", Polygon.getCount()); // M2 HOMEWORK STATIC
		for (Polygon p: shapes) {
			System.out.println(p);
		}

		//alternative sorting #1: AreaSidesComparator
		System.out.println("\nSort using AreaSidesComparator:");
		Collections.sort(shapes, new AreaSidesComparator()); //M3 USING COMPARATOR
		for (Polygon p: shapes) {
			System.out.println(p);
		}

		//alternative sorting #2: SidesAreaComparator
		System.out.println("\nSort using SidesAreaComparator:");
		Collections.sort(shapes, new SidesAreaComparator()); //M3 USING COMPARATOR
		for (Polygon p: shapes) {
			System.out.println(p);
		}

		//alternative sorting #3: ColorAreaComparator
		System.out.println("\nSort using ColorAreaComparator:");
		Collections.sort(shapes, new ColorAreaComparator()); //M3 USING COMPARATOR
		for (Polygon p: shapes) {
			System.out.println(p);
		}
	}
}
