package work05.point;

public class PositivePoint extends Point{
	public PositivePoint() {
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(x, y);
		if(getX() < 0) {
			super.move(0, getY());
		}
		if(getY() < 0) {
			super.move(getX(), 0);
		}
	}
	public void setXY(int x, int y) {
		super.move(x, y);
		if(getX() < 0) {
			super.move(0, getY());
		}
		if(getY() < 0) {
			super.move(getX(), 0);
		}
	}
	public void move(int x, int y) {
		super.move(getX() + x, getY() + y);
		
		if(getX() + x < 0) {
			super.move(0, getY());
		}
		else if(getY() + y < 0) {
			super.move(getX(), 0);
		}
	}
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}

}
