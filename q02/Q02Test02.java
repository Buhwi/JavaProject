package q02;
import java.util.Random;
import java.util.Scanner;

public class Q02Test02 {
	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String name;
		String[] com = {"가위", "바위","보"};
		
		
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			Scanner sc = new Scanner(System.in);
			name = sc.next();
			Random ran = new Random();
			int ranInt = ran.nextInt(3);
			
			
			
			if (name.equals("그만"))
				break;
			
			
			if (com[ranInt].equals(name)) {
				System.out.println("비겼습니다.");
			}
			if (name.equals("가위")) {
				if (com[ranInt].equals("보"))
					System.out.println("사용자 = " + name + ", 컴퓨터 = " + com[ranInt] +", 사용자가 이겼습니다.");
				if (com[ranInt].equals("바위"))
					System.out.println("사용자 = " + name + ", 컴퓨터 = " + com[ranInt] +", 사용자가 졌습니다.");
			}
			
			if (name.equals("바위")) {
				if (com[ranInt].equals("가위"))
					System.out.println("사용자 = " + name + ", 컴퓨터 = " + com[ranInt] +", 사용자가 이겼습니다.");
				if (com[ranInt].equals("보"))
					System.out.println("사용자 = " + name + ", 컴퓨터 = " + com[ranInt] +", 사용자가 졌습니다.");
			}
			
			if (name.equals("보")) {
				if (com[ranInt].equals("바위"))
					System.out.println("사용자 = " + name + ", 컴퓨터 = " + com[ranInt] +", 사용자가 이겼습니다.");
				if (com[ranInt].equals("가위"))
					System.out.println("사용자 = " + name + ", 컴퓨터 = " + com[ranInt] +", 사용자가 졌습니다.");
			}
			
			
		}
	}
}
