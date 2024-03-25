package week04;

public class Circle {
	private double radius;
	private double area;
	private double circum;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		this.area = this.radius * this.radius * 3.14;
		return this.area;
	}
	public double getCircum() {
		this.circum = 2 * 3.14 * this.radius;
		return this.circum;
	}
}
