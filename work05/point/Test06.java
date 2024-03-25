package work05.point;

public class Test06 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.setXY(-1, 13);
		System.out.println(p.toString() + "입니다.");
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(5, -30);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");

	}

}
