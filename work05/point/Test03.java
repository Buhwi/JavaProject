package work05.point;

public class Test03 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10, 20);
		String str = cp.toString();
		System.out.println(str + "인 점입니다.");
		cp.setColor("RED");
		System.out.println(cp.toString() + "인 점입니다.");
	}

}
