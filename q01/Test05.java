package q01;

public class Test05 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		while (true) {
			if (i > 50) break;
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}
}
