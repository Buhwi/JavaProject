package work08Test06;
import java.util.Scanner;
import java.util.Random;

public class Gambling {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	private String[] name;
	private int num;
	private int[] gam = new int[3];
	private boolean flag = false;
	
	public void game() {
		System.out.print("겜블링 게임에 참여할 선수 숫자 : ");
		num = sc.nextInt();
		name = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print((i+1) + "번쨰 선수 이름 >> ");
			name[i] = sc.next();
		}
		sc.nextLine();
		int n = 0;
		while(true) {
			game1(n);
			n++;
			if(flag == true)
				break;
			if(n == 3)
				n = 0;
		}
	}
	public void game1(int n) {
		System.out.print("[" + name[n] + "] : <Enter>");
		sc.nextLine();
		for(int i = 0; i < gam.length; i++) {
			gam[i] = (ran.nextInt(3) + 1);
		}
		System.out.print("       " + gam[0] + "  " + gam[1]+ "  " + gam[2]);
		
		if(gam[0] == gam[1] && gam[1] == gam[2]) {
			System.out.println("  " + name[n] + "님이 이겼습니다!");
			flag = true;
		}
		else
			System.out.println("  " + "아쉽군요!");
		
	}	
}
