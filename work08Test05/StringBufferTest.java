package work08Test05;
import java.util.Scanner;


public class StringBufferTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		String temp1 = sc.nextLine();
		StringBuffer sb = new StringBuffer(temp1);
		
		while(true) {
			
			System.out.print("명령: ");
			String temp2 = sc.nextLine();
			
			if(temp2.equals("그만"))
				break;
			
			String temp3 = sb.buffer(sb.getTemp(), temp2);
			if(temp3.equals("no")) {
				System.out.println("찾을 수 없습니다!");
			}
			else if(temp3.equals("nono")) {
				System.out.println("잘못된 명령입니다.");
			}
			else {
				System.out.println(sb.getTemp());
			}
		}
		
		sc.close();
	}
}
