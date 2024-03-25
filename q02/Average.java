package q02;


public class Average {

	public static void main(String[] args) {
		int[] num = new int[args.length];
		int sum = 0;
		int average;
		
		for (int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
			sum = sum + num[i];
		}
		
		average = sum / (num.length);
		
		System.out.println(average);
		
		

	}

}
