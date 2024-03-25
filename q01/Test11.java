package q01;

import q01.Solution;

class Solution{
	public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = 0;
        for(int i = 0; i < queries.length; i++){
            int num1 = queries[i][0];
            int num2 = queries[i][1];
            int num3 = queries[i][2];
            
            for(int j = 0; j < num2-num1; j++){
                num = num3;
                if(arr[j + num1] > num3){
                    num = arr[j + num1];
                }
                if(num > num3) answer[i] = num;
                else answer[i] = -1;
            }
            
        }
        return answer;
}

public class Test11 {
	
	public static void main(String[] args) {
		int[] answer = new int[3];
		int arr[] = {0,1,2,4,3};
		int queries[][] = {{0,4,2}, {0,3,2}, {0,2,2}};
		
		answer = Solution.solution(arr, queries);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		}

	}

}
