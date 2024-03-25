package q01;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		
		switch (in) {
		
		case "가위" :
			System.out.println(1);
			break;
		
		case "바위" :
			System.out.println(2);
			break;
		
		case "보" :
			System.out.println(3);
			break;
		
		default :
			System.out.println(0);
			break;
 		}
			
		
		}
}
