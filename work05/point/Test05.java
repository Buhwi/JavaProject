package work05.point;

public class Test05 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp(5);
		System.out.println(p.toString() + "입니다.");
		p.moveDown(-3);
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(10, -20, -30);
		System.out.println(p.toString() + "입니다.");

	}

}
