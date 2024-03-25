package work08Test04;
import java.util.Scanner;
import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int user;
		int com;
		boolean flag = true;
		
		while(flag) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			user = sc.nextInt();
			com = rn.nextInt(2) + 1;
			
			switch(user) {
			case 1:
				if(com == 1) {
					System.out.println("철수(가위) : 컴퓨터(가위)");
					System.out.println("비겼습니다.");
				}
				else if(com == 2) {
					System.out.println("철수(가위) : 컴퓨터(바위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if(com == 3) {
					System.out.println("철수(가위) : 컴퓨터(보)");
					System.out.println("철수가 이겼습니다.");
				}
				break;
			case 2:
				if(com == 1) {
					System.out.println("철수(바위) : 컴퓨터(가위)");
					System.out.println("철수가 이겼습니다.");
				}
				else if(com == 2) {
					System.out.println("철수(바위) : 컴퓨터(바위)");
					System.out.println("비겼습니다.");
				}
				else if(com == 3) {
					System.out.println("철수(바위) : 컴퓨터(보)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				break;
			case 3:
				if(com == 1) {
					System.out.println("철수(보) : 컴퓨터(가위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if(com == 2) {
					System.out.println("철수(보) : 컴퓨터(바위)");
					System.out.println("철수가 이겼습니다.");
				}
				else if(com == 3) {
					System.out.println("철수(보) : 컴퓨터(보)");
					System.out.println("비겼습니다.");
				}
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("입력값을 확인 바랍니다.");
			}
			System.out.println();
		}
		sc.close();
	}

}
