package week03Wh;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		System.out.printf("점 (x,y)의 좌표를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if ((x > 100 && x < 200) && (y > 100 && y < 200)) {
				System.out.printf("(%d,%d)는 사격형 안에 있습니다.", x, y);
		}
		else {
			System.out.printf("(%d,%d)는 사격형 바깥에 있습니다.", x, y);
		}
	}
}
