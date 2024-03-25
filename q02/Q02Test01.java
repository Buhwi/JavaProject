package q02;
import java.util.Scanner;

public class Q02Test01 {
	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		String name;
		
		while (true) {
			System.out.print("과목이름>>");
			Scanner sc = new Scanner(System.in);
			name = sc.next();
			int n = 0;
			
			if(name.equals("그만"))
				break;
			
			for (int i = 0; i < course.length;i++) {
				if(course[i].equals(name)) {
					n = score[i];
				}
			}
				
			if(n == 0) {
				System.out.println("없는 과목입니다.");
			}
			else {
				System.out.println(name+"의 점수는 "+n);
			}
			
			
				
			
		}
		
		
	}
}
