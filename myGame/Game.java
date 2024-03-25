package myGame;
import java.util.Random;


public class Game {
	Random ran = new Random();
	Bear b = new Bear(ran.nextInt(20),ran.nextInt(10),1);
	Fish f = new Fish(ran.nextInt(20),ran.nextInt(10),1);

	
	public void start() {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.");
		
		while(true) {
			for(int i = 0; i < 10; i++) {
				for(int n = 0; n < 20; n++) {
					if(b.getX() == n && b.getY() == i)
						b.getShape();
					else if(f.getX() == n && f.getY() == i)
						f.getShape();
					else
						System.out.print("- ");
				}
				System.out.println();
			}
			if(b.collide(f) == true) {
				System.out.print("Bear Wins!!");
				break;
			}
			b.move();
			f.move();
			
			System.out.println();
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Game g = new Game();
		g.start();

	}

}
