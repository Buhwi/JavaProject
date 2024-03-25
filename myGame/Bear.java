package myGame;
import java.util.Scanner;

public class Bear extends GameObject {
	Scanner sc = new Scanner(System.in);
	int temp[] = new int[2];
	public Bear(int x, int y, int distance){
		super(x, y, distance);
	}
	
	
	public void move() {
		while(true) {
			System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
			String in = sc.next();
			switch(in) {
			case "a":
				if(x - distance < 0) {
					System.out.println("경계선을 넘었습니다.");
					continue;
				}
				x = x - distance;
				break;
			case "s":
				if(y + distance > 9) {
					System.out.println("경계선을 넘었습니다.");
					continue;
				}
				y = y + distance;
				break;
			case "w":
				if(y - distance < 0) {
					System.out.println("경계선을 넘었습니다.");
					continue;
				}
				y = y - distance;
				break;
			case "d":
				if(x + distance > 19) {
					System.out.println("경계선을 넘었습니다.");
					continue;
				}
				x = x + distance;
				break;
			}
			break;
		}
	}
	public void getShape() {
		System.out.print("B ");
	}
}
