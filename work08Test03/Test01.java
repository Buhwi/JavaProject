package work08Test03;
import java.util.Scanner;

public class Test01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String temp = sc.nextLine();
			if(temp.equals("그만"))
				break;
			
			String[] array = temp.split(" ");
			System.out.println("어절 개수는 " + array.length);
		}
		System.out.println("종료합니다..");
		sc.close();
	}
}
