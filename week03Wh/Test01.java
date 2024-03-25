package week03Wh;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.printf("2자리 정수 입력(10~99)>>");
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		if (a % 10 == a / 10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
	}
}
