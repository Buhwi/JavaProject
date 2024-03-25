package work04.shapeList;

public class ShapeListTest {

	public static void main(String[] args) {
		ShapeList shapeList = new ShapeList();
		
		Line line = new Line();
		shapeList.add(line);
		shapeList.add(new Rect());
		shapeList.add(new Circle());
		shapeList.add(new Rect());
		
		shapeList.traverse();

	}

}
