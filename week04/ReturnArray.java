package week04;

public class ReturnArray {
	public static int[] makeArray() {
		int[] array = new int[4];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
		
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		
		for (int i = 0 ;i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
