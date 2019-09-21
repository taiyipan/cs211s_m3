/** Child class of Polygon class */
public class Circle extends Polygon {
	//data members
	private double radius;
	/** no-arg constructor */
	public Circle() {
		super(Integer.MAX_VALUE);
		this.radius = 0;
	}
	/** 1-arg constructor */
	public Circle(double radius) {
		this();
		this.radius = radius;
		super.setArea(calculateArea());
	}
	public Circle(int radius) {
		this((double) radius);
	}
	/** 2-arg constructor */
	public Circle(double radius, Color color) { // M2 HOMEWORK ENUM USE
		this(radius);
		super.setColor(color);
	}
	public Circle(int radius, Color color) { // M2 HOMEWORK ENUM USE
		this((double) radius, color);
	}
	/** static method for calculating diameter of a circle */
	public static double calculateDiameter(double radius) { // M2 HOMEWORK STATIC
		return radius * 2;
	}
	/** instance method equivalent */
	public double calculateDiameter() {
		return Circle.calculateDiameter(this.radius);
	}
	/** static method for calculating area of a circle */
	public static double calculateArea(double radius) { // M2 HOMEWORK STATIC
		return Math.PI * Math.pow(radius, 2);
	}
	/** instance method equivalent */
	public double calculateArea() {
		return Circle.calculateArea(this.radius);
	}
	/** static method for calculating circumference of a circle */
	public static double calculateCircumference(double radius) { // M2 HOMEWORK STATIC
		return 2 * Math.PI * radius;
	}
	/** instance method equivalent */
	public double calculateCircumference() {
		return Circle.calculateCircumference(this.radius);
	}
	/** radius getter */
	public double getRadius() {
		return this.radius;
	}
	/** diameter getter */
	public double getDiameter() {
		return calculateDiameter();
	}
	/** circumference getter */
	public double getCircumference() {
		return calculateCircumference();
	}
	/** radius setter */
	public void setRadius(double radius) {
		this.radius = radius;
		super.setArea(calculateArea());
	}
	@Override
	public String toString() {
		return "Circle, radius: " + this.radius + ", diameter: " + getDiameter() + ", circumference: " + getCircumference() + ", area: " + super.getArea() + ", color: " + super.getColor();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			//downcast from Object to Circle
			Circle other = (Circle) obj;
			//additionally, compare radius for equality
			return super.equals(obj) && Math.abs(this.radius - other.getRadius()) < Polygon.threshold;
		} else {
			return false;
		}
	}
}
