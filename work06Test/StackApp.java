package work06Test;
import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		int i = 0;
		String stack;
		
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		length = sc.nextInt();
		StringStack s = new StringStack(length);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			stack = sc.next();
			i = i + 1;
			if (stack.equals("그만")) {
				break;
			}
			
			if(i > length) {
				System.out.println("스택이 꽉 차서 푸시 불가!!");
			}
			else {
				s.push(stack);
			}
		}
		
		System.out.print("스택에 저장된 모든 문자열을 pop : ");
		s.show();
		
		sc.close();
		
		

	}

}
