package work04;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super(0, 0);
		this.color = setBlack();
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = setBlack();
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return this.color + "색의 (" + getX() + ", " + getY() + ")의 점";
	}
	private String setBlack() {
		return "BLACK";
	}
	
}
