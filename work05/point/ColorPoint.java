package work05.point;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public String toString() {
		return this.color + "색의 (" + getX() + ", " + getY() + ")";
	}
}
