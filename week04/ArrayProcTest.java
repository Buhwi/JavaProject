package week04;
import java.util.Random;

class ArrayProc {
	public static int [] getValues(int[] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (rand.nextInt(100)+1);
		}
		return array;
		
	}
	
	public static double getAverage(int[] array) {
		double average = 0.0;
		for(int i = 0; i < array.length; i++) {
			average = average + array[i];
		}
		return average / array.length;
	}
}


public class ArrayProcTest {
	final static int STUDENT = 5;
	
	public static void main(String[] args) {
		int[] arr = new int[STUDENT];
		
		arr = ArrayProc.getValues(arr);
		double average = ArrayProc.getAverage(arr);
		System.out.println(average);
		
		

	}

}
