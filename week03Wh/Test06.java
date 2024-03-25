package week03Wh;

public class Test06 {

	public static void main(String[] args) {
		int[] randomArray = new int[10];
		int sum = 0;
		System.out.printf("랜덤한 정수들 : ");
		
		for (int i = 0; i < randomArray.length;i++) {
			int j = (int)(Math.random()*10 +1);
			randomArray[i] = j;
			sum = sum + j;
			System.out.printf("%d ", randomArray[i]);
		}
		double a1 = randomArray.length;
		double average = sum / a1;
		
		System.out.println("\n평균은 "+ average);
		

	}

}
