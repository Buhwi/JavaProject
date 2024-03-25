package q01;

public class Test00 {
	public static void main(String args[]) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
		
		int[] answer = new int[queries.length];
		int temp;
		for(int i = 0; i < answer.length; i++) {
			temp = -1;
			for(int n = 0; n < arr.length; n++) {
				if(queries[i][0] >= arr[n] && queries[i][1] <= arr[n])
					temp = arr[n];
				
			}
			if(answer)
		}
		
	}
}
