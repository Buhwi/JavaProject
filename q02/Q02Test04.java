package q02;
import java.util.Scanner;

public class Q02Test04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("수학, 과학, 영어순으로3개의점수입력>>"); 
		int math= scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은" +me.average()); // average()는평균을계산하여리턴
		
		scanner. close();
	}
}
