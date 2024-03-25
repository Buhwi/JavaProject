package work04.shapeList;

public class ShapeList {
	public Shape start;
	public Shape last;
	
	public ShapeList() {
		start = new Shape();
		last = new Shape();
	}
	
	public void add(Shape s) {
		this.last = start;
		this.start = s;
	}
	
	public void traverse() {
		start.draw();
		last.draw();
	}
	

}
