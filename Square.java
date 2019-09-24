/** Child class of Rectangle class */
public class Square extends Rectangle {
	/** no-arg constructor */
	public Square() {
		super();
	}
	/** 1-arg constructor */
	public Square(double side) {
		super(side, side);
	}
	public Square(int side) {
		this((double) side);
	}
	public Square(Color color) {
		this();
		super.setColor(color);
	}
	/** 2-arg constructor */
	public Square(double side, Color color) { // M2 HOMEWORK ENUM USE
		this(side);
		super.setColor(color);
	}
	public Square(int side, Color color) { // M2 HOMEWORK ENUM USE
		this((double) side, color);
	}
	/** side getter */
	public double getSide() {
		return super.getLength();
	}
	/** side setter */
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	/** static method for calculating area of a square */
	public static double calculateArea(double side) { // M2 HOMEWORK STATIC
		return side * side;
	}
	@Override
	public String toString() {
		return "Square [side: " + getSide() + ", area: " + super.getArea() + ", color: " + super.getColor() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Square) {
			return super.equals(obj);
		} else {
			return false;
		}
	}
}
