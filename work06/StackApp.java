package work06;
import java.util.Scanner;

class ArrayList{
	String list[];
	int top;
	public ArrayList(int stack) {
		list = new String[stack];
	}
	public void storage() {
		
	}
}

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stackLength;
		int stackCapacity;
		String temp;
		int num = 0;
		boolean flag = true;
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		stackLength = sc.nextInt();
		ArrayList list = new ArrayList(stackLength);
		
		while(flag) {
			System.out.print("문자열 입력 >> ");
			temp = sc.next();
			num += 1;
			if(num >= stackLength) {
				System.out.println("스택이 꽉 차서 푸시 불가!!");
			}
			else {
				
			}
			
		}
		
		

		sc.close();
	}

}
