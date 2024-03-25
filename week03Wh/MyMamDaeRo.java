package week03Wh;

public class MyMamDaeRo {
	public static void main(String[] args) {
		int[][] array = new int[5][];
		array[0] = new int[3];
		array[1] = new int[2];
		array[2] = new int[5];
		array[3] = new int[4];
		array[4] = new int[1];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i+1)*10 + j;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.println();
		}
	}
}
