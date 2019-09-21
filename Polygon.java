/** Polygon class */
public class Polygon implements Comparable<Polygon> {
	//data members
	private int sides;
	private double area;
	private Color color; // M2 HOMEWORK ENUM USE
	protected static double threshold = 0.0001; // M2 HOMEWORK STATIC
	protected static int count = 0; // M2 HOMEWORK STATIC
	/** no-arg constructor */
	public Polygon() {
		this.sides = 0;
		this.area = 0;
		Polygon.count++; // M2 HOMEWORK STATIC
	}
	/** 1-arg constructor */
	public Polygon(int sides) {
		this();
		this.sides = sides;
	}
	public Polygon(Color color) { // M2 HOMEWORK ENUM USE
		this();
		this.color = color;
	}
	/** 2-arg constructor */
	public Polygon(int sides, double area) {
		this();
		this.sides = sides;
		this.area = area;
	}
	public Polygon(int sides, int area) {
		this(sides, (double) area);
	}
	/** 3-arg constructor */
	public Polygon(int sides, double area, Color color) { // M2 HOMEWORK ENUM USE
		this(sides, area);
		this.color = color;
	}
	public Polygon(int sides, int area, Color color) { // M2 HOMEWORK ENUM USE
		this(sides, (double) area, color);
	}
	/** area getter */
	public double getArea() {
		return this.area;
	}
	/** sides getter */
	public int getSides() {
		return this.sides;
	}
	/** count getter */
	public static int getCount() { // M2 HOMEWORK STATIC
		return Polygon.count;
	}
	/** color getter */
	public String getColor() { // M2 HOMEWORK ENUM USE
		return this.color.toString();
	}
	/** area setter */
	public void setArea(double area) {
		this.area = area;
	}
	/** sides setter */
	public void setSides(int sides) {
		this.sides = sides;
	}
	/** color setter */
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		//output instance data information
		return sides + "-sided Polygon, area: " + this.area + ", color: " + getColor();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Polygon) {
			//downcast from Object to Polygon
			Polygon other = (Polygon) obj;
			//compare sides and area for equality
			if (this.sides == other.getSides() && Math.abs(this.area - other.getArea()) < Polygon.threshold) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	/** implementing Comparable interface: using area as basis for sorting */
	public int compareTo(Polygon other) {
		if (this.area > other.getArea()) {
			return 1;
		} else if (this.area < other.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}
