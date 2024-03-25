package work05.point;

public class Point3D extends Point{
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		}
	public int getZ() {
		return this.z;
	}
	public void moveUp(int z) {
		this.z = this.z + z;
	}
	public void moveDown(int z) {
		this.z = this.z - z;
	}
	public void move(int x, int y, int z) {
		super.move(getX() + x, getY() + y);
		this.z = this.z + z;
	}
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + this.z + ") 인 점";
	}
}
