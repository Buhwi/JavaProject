package myGame;
import java.util.Random;

public class Fish extends GameObject{
	Random ran = new Random();
	int n = 1;
	public Fish(int x, int y, int distance){
		super(x, y, distance);
	}
	
	
	public void move() {
		if(n % 2 == 0) {
			if(n%10 != 0) {
				while(true) {
					int m = ran.nextInt(3);
					switch(m) {
					case 0:
						if(x - distance < 0) {
							continue;
						}
						x = x - distance;
						break;
					case 1:
						if(y + distance > 9) {
							continue;
						}
						y = y + distance;
						break;
					case 2:
						if(y - distance < 0) {
							continue;
						}
						y = y - distance;
						break;
					case 3:
						if(x + distance > 19) {
							continue;
						}
						x = x + distance;
						break;
					}
					break;
				}
			}
		}
		n = n + 1;
	}
	public void getShape() {
		System.out.print("F ");
	}
}
