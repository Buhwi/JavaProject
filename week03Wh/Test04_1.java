package week03Wh;
import java.util.Scanner;

public class Test04_1 {
	
	public static void main(String[] args) {
		System.out.printf("연산식을 적으세요 >> ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		char temp = sc.next().charAt(0);
		int y = sc.nextInt();
		
		switch (temp) {
		case '+' : 
			System.out.printf("%d + %d의 연산결과는 %d", x, y, x+y);
			break;
		case '=' : 
			if (x == y) {
				System.out.println(x+"와 "+ y +  " 값이 같습니다.");
			}
			else {
				System.out.println(x+"와 "+ y +  " 값이 다릅니다.");
			}
			break;
		case '*' : 
			System.out.printf("%d * %d의 연산결과는 %d", x, y, x*y);
			break;
		case '/' : 
			System.out.printf("%d / %d의 연산결과는 %d", x, y, x/y);
			break;
		default :
			System.out.printf("입력값이 올바르지 않습니다.");
				
		}
	}
}
