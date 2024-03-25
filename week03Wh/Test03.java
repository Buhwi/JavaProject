package week03Wh;
import java.util.Scanner;

public class Test03 {
	
	public static boolean inRect(int x1, int y1, int x2, int y2, int rectx1, int recty1, int rectx2, int recty2) {
		if (((rectx1 < x1) && (rectx2 < x1)) || ((rectx1 > x2) && (rectx2 > x2)) || ((recty1 < y1) && (recty2 < y1)) || ((recty1 > y2) && (recty2 > y2))) {
			return false;
		}
		else return true;
	}
	
	
	public static void main(String[] args) {
		int x1 = 100;
		int y1 = 100;
		int x2 = 200;
		int y2 = 200;
		
		System.out.printf("두점 (x1, y1)을 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		int rectx1 = sc.nextInt();
		int recty1 = sc.nextInt();
		
		System.out.printf("두점 (x2, y2)을 입력하시오 : ");
		
		Scanner in = new Scanner(System.in);
		int rectx2 = in.nextInt();
		int recty2 = in.nextInt();
		
		boolean rect = inRect(x1, y1, x2, y2, rectx1, recty1, rectx2, recty2);
		
		if (rect == true) System.out.println("직사각형과 충돌하였습니다.");
		else System.out.println("직사각형과 충돌하지 않았습니다.");
	}
}
