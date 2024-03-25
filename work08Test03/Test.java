package work08Test03;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp;
		
		while(true) {
			System.out.print(">> ");
			temp = sc.nextLine();
			
			if(temp.equals("그만")) {
				System.out.println("종료합니다....");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(temp);
			System.out.println("어절 개수는 "+ st.countTokens());
			
		}
		
		sc.close();
	}

}
