package work05.point;

public class Test04 {
	public static void main(String args[]) {
		ColorPoint01 zeroPoint = new ColorPoint01();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint01 blackPoint = new ColorPoint01(10, 10);
		blackPoint.setXY(5, 5);
		blackPoint.setColor("RED");
		System.out.println(blackPoint + "입니다.");
		blackPoint.move(10, -25);
		System.out.println(blackPoint + "입니다.");
	}
	
}
