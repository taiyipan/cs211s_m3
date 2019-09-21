/** Child class of Polygon class */
public class Triangle extends Polygon {
	//members
	private double base;
	private double height;
	/** no-arg constructor */
	public Triangle() {
		super(3);
		this.base = 0;
		this.height = 0;
	}
	/** 2-arg constructor */
	public Triangle(double base, double height) {
		this();
		this.base = base;
		this.height = height;
		super.setArea(calculateArea());
	}
	public Triangle(int base, int height) {
		this((double) base, (double) height);
	}
	/** 3-arg constructor */
	public Triangle(double base, double height, Color color) { // M2 HOMEWORK ENUM USE
		this(base, height);
		super.setColor(color);
	}
	public Triangle(int base, int height, Color color) { // M2 HOMEWORK ENUM USE
		this((double) base, (double) height, color);
	}
	/** static method for calculating area of a triangle */
	public static double calculateArea(double base, double height) { // M2 HOMEWORK STATIC
		return (base * height) / 2.0;
	}
	/** instance method equivalent */
	public double calculateArea() {
		return Triangle.calculateArea(this.base, this.height);
	}
	/** base getter */
	public double getBase() {
		return this.base;
	}
	/** height getter */
	public double getHeight() {
		return this.height;
	}
	/** base setter */
	public void setBase(double base) {
		this.base = base;
		super.setArea(calculateArea(this.base, this.height));
	}
	/** height setter */
	public void setHeight(double height) {
		this.height = height;
		super.setArea(calculateArea(this.base, this.height));
	}
	@Override
	public String toString() {
		return "Triangle, base: " + this.base + ", height: " + this.height + ", area: " + super.getArea() + ", color: " + super.getColor();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Triangle) {
			//downcast from Object to Triangle
			Triangle other = (Triangle) obj;
			//additionally, compare base and height for equality
			return super.equals(obj) && Math.abs(this.base - other.getBase()) < Polygon.threshold && Math.abs(this.height - other.getHeight()) < Polygon.threshold;
		} else {
			return false;
		}
	}
}
