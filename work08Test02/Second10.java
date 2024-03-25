package work08Test02;
import java.util.Scanner;
import java.util.Calendar;

public class Second10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("참가자 수 >> ");
		int num = sc.nextInt();
		int win = 0;
		
		int[] time01 = new int[num];
		int[] time02 = new int[num];
		int[] time03 = new int[num];
		String[] name = new String[num];
		
		int[] result = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("참가자 "+(i + 1)+" 이름 >> ");
			name[i] = sc.next();
		}
		System.out.println();
		sc.nextLine();
		for(int i = 0; i < num; i++) {
			System.out.print(name[i] + " 시작 <enter> 키 >>");
			sc.nextLine();
			
			Calendar time = Calendar.getInstance();
			time01[i] = time.get(Calendar.SECOND);
			System.out.println("    현재 초 시간 = "+ time01[i]);
			
			System.out.print("10초 예상 후 <Enter>키 >> ");
			sc.nextLine();
			
			
			Calendar time0 = Calendar.getInstance();
			time02[i] = time0.get(Calendar.SECOND);
			System.out.println("    현재 초 시간 = "+ time02[i]);
			
			time03[i] = time02[i] - time01[i];
			if(time03[i] < 0) {
				time03[i] = time03[i] + 60;
			}
		}
		
		for(int i = 0; i < num; i ++) {
			result[i] = 10 - time03[i];
			if(result[i] < 0) {
				result[i] = result[i] - (result[i]*2);
			}
			if(i > 0 && result[i] < result[i-1])
				win = i;
		}
		
		System.out.println();
		for(int i = 0; i < num; i ++) {
			System.out.print(name[i] + "의 결과 " + time03[i] +", ");
		}
		
		
		
		System.out.print("승자는 "+ name[win]);
		
		sc.close();
		
	}
}
