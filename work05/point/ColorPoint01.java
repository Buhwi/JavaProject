package work05.point;

public class ColorPoint01 extends Point {
	private String color;
	public ColorPoint01() {
		super(0, 0);
		zeroColor();
	}
	public ColorPoint01(int x, int y) {
		super(x, y);
		zeroColor();
	}
	public ColorPoint01(int x, int y, String color) {
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
		super.move(x, y);
	}
	public void move(int x, int y) {
		super.move(getX() + x, getY() + y);
	}
	private void zeroColor() {
		this.color = "BLACK";
	}
	public String toString() {
		return this.color + "색의 (" + getX() + ", " + getY() + ")";
	}
}
