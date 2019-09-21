/** Child class of Polygon class */
public class Rectangle extends Polygon {
	//data members
	private double length;
	private double width;
	/** no-arg constructor */
	public Rectangle() {
		super(4);
		this.length = 0;
		this.width = 0;
	}
	/** 2-arg constructor */
	public Rectangle(double length, double width) {
		this();
		this.length = length;
		this.width = width;
		super.setArea(calculateArea());
	}
	public Rectangle(int length, int width) {
		this((double) length, (double) width);
	}
	/** 3-arg constructor */
	public Rectangle(double length, double width, Color color) { // M2 HOMEWORK ENUM USE
		this(length, width);
		super.setColor(color);
	}
	public Rectangle(int length, int width, Color color) { // M2 HOMEWORK ENUM USE
		this((double) length, (double) width, color);
	}
	/** static method for calculating area of a rectangle */
	public static double calculateArea(double length, double width) { // M2 HOMEWORK STATIC
		return length * width;
	}
	/** instance method equivalent */
	public double calculateArea() {
		return Rectangle.calculateArea(this.length, this.width);
	}
	/** length getter */
	public double getLength() {
		return this.length;
	}
	/** width getter */
	public double getWidth() {
		return this.width;
	}
	/** length setter */
	public void setLength(double length) {
		this.length = length;
		super.setArea(calculateArea());
	}
	/** width setter */
	public void setWidth(double width) {
		this.width = width;
		super.setArea(calculateArea());
	}
	@Override
	public String toString() {
		return "Rectangle, length: " + this.length + ", width: " + this.width + ", area: " + super.getArea() + ", color: " + super.getColor();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			//downcast from Object to Rectangle
			Rectangle other = (Rectangle) obj;
			//additionally, compare length and width for equality
			return super.equals(obj) && Math.abs(this.length - other.getLength()) < Polygon.threshold && Math.abs(this.width - other.getWidth()) < Polygon.threshold;
		} else {
			return false;
		}
	}
}
