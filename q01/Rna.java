package q01;
import java.util.Random;

public class Rna {
	public static void main(String args[]) {

		Random random = new Random();
		int ran;
		
		for(int i = 0; i < 10; i++) {
			ran = (random.nextInt(155)) + 101;
			System.out.print(ran + " ");
		}
	}
}
