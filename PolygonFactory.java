/** PolygonFactory manufactures a child class of Polygon based on Shape enum input */
public class PolygonFactory {
	/** returns a child class of Polygon based on Shape enum input */
	public static Polygon newPolygon(Shape type, Color color) {
		if (type == Shape.TRIANGLE) {
			return new Triangle(color);
		} else if (type == Shape.RECTANGLE) {
			return new Rectangle(color);
		} else if (type == Shape.SQUARE) {
			return new Square(color);
		} else if (type == Shape.CIRCLE) {
			return new Circle(color);
		} else {
			throw new IllegalArgumentException("Invalid Color type");
		}
	}
}
