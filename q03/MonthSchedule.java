package q03;
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] schedule = new String[30];
		
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int work = sc.nextInt();
			
			if(work == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(work < 1 || work > 3) {
				System.out.println("입력값을 확인 해주시길 바랍니다.\n");
				continue;
			}
			
			System.out.print("날짜(1~30)?");
			int day = sc.nextInt();
			
			if (day < 1 || day > 30) {
				System.out.println("입력값을 확인 해주시길 바랍니다.\n");
				continue;
			}
			
			if (work == 1) {
				System.out.print("할일(빈칸없이입력)?");
				schedule[day-1] = sc.next();
			}
			
			if(work == 2) {
				if (schedule[day-1] == null) {
					System.out.println(day + "일의 할 일이 없습니다.");
				}
				else {
					System.out.println(day + "일의 할 일은 "+schedule[day-1]+"입니다.");
				}
			}
			
			
			System.out.println();
		}
		sc.close();
	}
}
