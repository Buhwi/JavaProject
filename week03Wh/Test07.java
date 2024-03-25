package week03Wh;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		System.out.printf("정수 몇개?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] array = new int[a];
		
		for (int i = 0; i < array.length;i++) {
			int b = (int)(Math.random()*100 +1);
			array[i] = b;
			for (int j = 0; j < i;j++) {
				if (array[j]==b) {
					i--;
				}
			}
		}
		
		for (int i = 0;i < array.length;i++) {
			System.out.printf("%d ", array[i]);
			if(i % 10 == 9)
				System.out.println();
		}

	}

}
