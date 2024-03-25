package q02;

public class Rectangle {
	public int x;
	public int y;
	public int width;
	public int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return this.width * this.height;
	}
	
	public void show() {
		System.out.printf("(%d, %d)에서 크기가 %dx%d인 사각형\n", x, y, width, height);
	}
	
	public boolean contains(Rectangle r) {
		if ((this.x < r.x && this.y < r.y) && ((this.x + this.width) > (r.x + r.width) && (this.y + this.height) > (r.y + r.height)))
			return true;
		else
			return false;
		
		
	}
}
