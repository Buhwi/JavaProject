package q04;

abstract class Shape{
	public void paint() {
		draw();
	}
	abstract public void draw();
}

class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	double getArea() {
		return 3.14*this.radius*this.radius;
	}
	public void draw() {
		System.out.println("반지름=" + this.radius);
	}
}

public class Test13 {

	public static void main(String[] args) {
		Circle p = new Circle(10);
		p.paint();
	}

}
