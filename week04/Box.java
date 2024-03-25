package week04;

public class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public Box(int w, int l, int h) {
		this.width = w;
		this.length = l;
		this.height = h;
		this.volume = w*l*h;
	}
	public Box whoseLargest(Box box) {
		if (this.volume > box.volume) {
			return this;
		}
		else {
			return box;
		}
	}
	public boolean isSameBox(Box box) {
		if (this.volume == box.volume) {
			return true;
		}
		else {
			return false;
		}
	}
}
